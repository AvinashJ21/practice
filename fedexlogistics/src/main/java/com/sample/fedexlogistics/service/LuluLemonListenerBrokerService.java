package com.sample.fedexlogistics.service;

import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

@Service
public class LuluLemonListenerBrokerService {

	 Logger log = LoggerFactory.getLogger(LuluLemonListenerBrokerService.class);
	
	@KafkaListener(id = "${kafka.id}",groupId = "${kafka.group-id}",topics = "${kafka.topic.name.lululemon}")
	public void newIncomingOrder(final ConsumerRecord<String, byte[]> record) throws IOException {
		
		log.info("New order received {}",record);
		Schema schema = new Schema.Parser().parse(ResourceUtils.getFile("classpath:avro/OrderDetailsAvro.avsc"));
		DatumReader<GenericRecord> datumReader = new GenericDatumReader<GenericRecord>(schema);
		Decoder decoder = DecoderFactory.get().binaryDecoder(record.value(), null);
		GenericRecord gr= datumReader.read(null, decoder);
		log.info("New order received {}",gr.get("productName"));
		 
	}
	
	
}
