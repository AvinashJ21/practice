package com.sample.shippingserviceavro.service;

import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.generated.sources.OrderDetailsAvro;
import com.sample.shippingserviceavro.configuration.ApplicationComplexConfigProperties;
import com.sample.shippingserviceavro.dto.OrderAvroSerializer;
import com.sample.shippingserviceavro.entities.ShippingOrderEntity;
import com.sample.shippingserviceavro.entities.util.XMLToObject;
import com.sample.shippingserviceavro.exception.OrderProcessingException;
import com.sample.shippingserviceavro.repo.ShippingRepo;

@Service
public class ShippingService {

	@Autowired
	ShippingRepo shippingRepo;

	@Autowired
	ApplicationComplexConfigProperties appComplxConfig;

	@Autowired
	KafkaTemplate<String, OrderAvroSerializer> kafkaTemplate;

	@Value("${app.orders.kafka-topic-name}")
	private String kafkaTopicName;

	Logger log = LoggerFactory.getLogger(ShippingService.class);

	public String createShippingOrder() {

		log.info("Kafka topic name {} and locations served {}", kafkaTopicName,
				appComplxConfig.getLogistics().get(kafkaTopicName));
		ShippingOrderEntity se = XMLToObject.readXMLFileData();
		if (se != null) {
			se = shippingRepo.save(se);
			OrderDetailsAvro avro = new OrderDetailsAvro();
			BeanUtils.copyProperties(se, avro);
			log.info("Avro msg for kafka {}", avro);
			publishToKafka(avro);
			return "Shipping order created " + se.getShippingId();
		} else {
			log.error("No files to process");
			return "No files to process";
		}

	}

	public void publishToKafka(OrderDetailsAvro avro) {

		List<String> validLocations = appComplxConfig.getLogistics().get(kafkaTopicName);
		if (validLocations.contains(avro.getCountry())) {

			try {
				Properties props = new Properties();
				props.put("bootstrap.servers", "localhost:9092");

				Producer<String, OrderDetailsAvro> producer = new KafkaProducer<>(props, new StringSerializer(),
						new OrderAvroSerializer());
//				producer.send(new ProducerRecord<>(kafkaTopicName,avro));
				producer.send(new ProducerRecord<>(kafkaTopicName, 0, kafkaTopicName, avro));
				

				producer.close();
			} catch (Exception e) {
				throw new OrderProcessingException(e.getMessage());
			}
		}

	}

}
