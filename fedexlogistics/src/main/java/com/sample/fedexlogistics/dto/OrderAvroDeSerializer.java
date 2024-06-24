package com.sample.fedexlogistics.dto;

import org.apache.avro.io.DatumReader;
import org.apache.avro.io.Decoder;
import org.apache.avro.io.DecoderFactory;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.kafka.common.serialization.Deserializer;

import com.generated.sources.OrderDetailsAvro;

public class OrderAvroDeSerializer implements Deserializer<OrderDetailsAvro> {

	@Override
	public OrderDetailsAvro deserialize(String topic, byte[] data) {
		 
		 
	        try {
	            if (data != null) {
	                DatumReader<OrderDetailsAvro> reader = new SpecificDatumReader<>(OrderDetailsAvro.getClassSchema());
	                Decoder decoder = DecoderFactory.get().binaryDecoder(data, null);
	                return reader.read(null, decoder);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return null;
 
	}
 
}