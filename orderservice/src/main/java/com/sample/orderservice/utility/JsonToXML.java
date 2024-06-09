package com.sample.orderservice.utility;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

@Component
public class JsonToXML {

	
	private static String XML_LOCATION;
	
	@Value("${app.orders.loc}")
	public void setXmlLocation(String location) {
		XML_LOCATION = location;
	}
	
   public static void ObjectToXML(Object obj,JAXBContext jxb) {
	   try {
	   Marshaller marshObj = jxb.createMarshaller();
	   marshObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	   marshObj.marshal(obj, new FileOutputStream(XML_LOCATION+"shiporder"+new Date().getTime()+".xml"));
		
	} catch (FileNotFoundException | JAXBException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   
   }

}
