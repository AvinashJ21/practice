package com.sample.shippingserviceavro.dto;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.io.BinaryEncoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.kafka.common.serialization.Serializer;

import com.generated.sources.OrderDetailsAvro;

public class OrderAvroSerializer implements Serializer<OrderDetailsAvro> {
    @Override
    public byte[] serialize(String topic, OrderDetailsAvro data) {

        byte[] arr = new byte[1000000];
        try {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                BinaryEncoder binaryEncoder = EncoderFactory.get().binaryEncoder(outputStream, null);
                GenericDatumWriter<OrderDetailsAvro> writer = new GenericDatumWriter<>(data.getSchema());
                writer.write(data, binaryEncoder);
                binaryEncoder.flush();
                arr = outputStream.toByteArray();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arr;
    }
}