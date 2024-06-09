package com.sample.shippingservice.util;

import java.io.File;
import java.util.Arrays;
import java.util.Optional;

import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.sample.shippingservice.dto.OrderDetailsJaxbDto;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

@Component
public class JaxbXMLToObject {

	private static String XML_LOCATION;

	@Value("${app.orders.loc}")
	public void setXmlLocation(String loc) {
		XML_LOCATION = loc;
	}

	public static OrderDetailsJaxbDto xmltoObject() {

		File f = getOldestFile();
		OrderDetailsJaxbDto ordrDto = null;
		if (f != null) {
			try {
				JAXBContext jaxbContext = JAXBContext.newInstance(OrderDetailsJaxbDto.class);
				Unmarshaller jaxUnmarshaller = jaxbContext.createUnmarshaller();
				ordrDto = (OrderDetailsJaxbDto) jaxUnmarshaller.unmarshal(f);
				ordrDto.setXmlFileName(f.getName());
				f.delete();
			} catch (JAXBException e) {

				e.printStackTrace();
			}
		}
		return ordrDto;
	}

	private static File getOldestFile() {

		File directory = new File(XML_LOCATION);
		File oldestFile = null;
		File[] logFiles = directory.listFiles();
		if (logFiles.length > 0) {

			if (logFiles.length == 1) {
				return logFiles[0];
			} else {
				Optional<File> optoldestFile = Arrays.stream(logFiles)
						.min((File s1, File s2) -> Long.compare(s1.lastModified(), s2.lastModified()));
				if (optoldestFile.isPresent()) {
					oldestFile = optoldestFile.get();
				}
			}

		}
		return oldestFile;
	}

}
