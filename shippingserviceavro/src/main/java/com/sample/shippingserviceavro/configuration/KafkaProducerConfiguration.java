package com.sample.shippingserviceavro.configuration;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.Serializer;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.sample.shippingserviceavro.dto.OrderAvroSerializer;

@Configuration
public class KafkaProducerConfiguration {

//	@Bean
//	public ProducerFactory<String, OrderAvroSerializer> producerFactory() {
//		Map<String, Object> configProps = new HashMap<>();
//		configProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//		configProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		configProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, Serializer.class);
//		return new DefaultKafkaProducerFactory<>(configProps);
//	}
//
//	public KafkaTemplate<String, OrderAvroSerializer> kafkaTemplate() {
//
//		return new KafkaTemplate<>(producerFactory());
//	}
}
