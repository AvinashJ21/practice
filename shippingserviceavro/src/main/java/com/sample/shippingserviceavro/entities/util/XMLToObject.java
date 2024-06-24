package com.sample.shippingserviceavro.entities.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.generated.sources.ShippingOrder;
import com.sample.shippingserviceavro.entities.ShippingOrderEntity;
import com.sample.shippingserviceavro.exception.OrderProcessingException;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

@Component
public class XMLToObject {

	private static String XML_LOCATION;
	private static String XML_PROCESSED_LOCATION;
	private static String XML_ERROR_LOCATION;

	@Value("${app.orders.loc}")
	public void setXmlLocation(String location) {
		XML_LOCATION = location;
	}

	@Value("${app.orders.processed}")
	public void setXmlprocessedLocation(String location) {
		XML_PROCESSED_LOCATION = location;
	}

	@Value("${app.orders.error}")
	public void setXmlErrorLocation(String location) {
		XML_ERROR_LOCATION = location;
	}

	public static ShippingOrderEntity readXMLFileData() {

		File f = getOldestFile();
		ShippingOrderEntity se = null;
		FileOutputStream fstream = null;
		FileInputStream finstream = null;
		if (null != f) {
			try {
				JAXBContext jaxbCntxt = JAXBContext.newInstance(ShippingOrder.class);
				Unmarshaller unmarshaller = jaxbCntxt.createUnmarshaller();
				System.out.println(f.getName());
				ShippingOrder orderDtls = (ShippingOrder) unmarshaller.unmarshal(f);
				se = new ShippingOrderEntity();
				BeanUtils.copyProperties(orderDtls, se);
				fstream = new FileOutputStream(new File(XML_PROCESSED_LOCATION+File.separator+f.getName()));
				finstream = new FileInputStream(f);
				fstream.write(finstream.readAllBytes());
				finstream.close();
				fstream.close();
				f.delete();
				se.setFileName(f.getName());
				
			} catch (JAXBException | IOException e) {
				movetoError(f);
				throw new OrderProcessingException(e.getMessage()!=null?e.getMessage():e.toString());
			}

		}
		return se;
	}

	private static File getOldestFile() {

		File dir = new File(XML_LOCATION);
		File oldestFile = null;
		File[] logFiles = dir.listFiles();
		if (logFiles.length > 0) {

			if (logFiles.length == 1) {
				return logFiles[0];
			} else {
				Optional<File> optoldestFile = Arrays.stream(logFiles).filter(f->f.isFile()).min(Comparator.comparing(File::lastModified));
				if (optoldestFile.isPresent()) {
					oldestFile = optoldestFile.get();
				}
			}

		}
		return oldestFile;

	}
	
	private static void movetoError(File f) {
		
		
		try {
			FileOutputStream fstream = new FileOutputStream(new File(XML_ERROR_LOCATION+File.separator+f.getName()));
			FileInputStream finstream = new FileInputStream(f);
			fstream.write(finstream.readAllBytes());
			finstream.close();
			fstream.close();
			f.delete();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
