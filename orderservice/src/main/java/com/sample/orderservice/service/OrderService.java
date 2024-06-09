package com.sample.orderservice.service;

import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.orderservice.cstmexceptions.OrderExistsException;
import com.sample.orderservice.dto.OrderEntityJaxbDto;
import com.sample.orderservice.dto.OrderRequestDTO;
import com.sample.orderservice.entities.OrderEntity;
import com.sample.orderservice.repository.OrderReposiory;
import com.sample.orderservice.utility.JsonToXML;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

@Service
public class OrderService {

	@Autowired
	OrderReposiory ordrRepo;
	
	Logger log = LoggerFactory.getLogger(OrderService.class);
	public Long saveOrder(OrderRequestDTO orderDto) {
		
		Optional<OrderEntity> orderE = ordrRepo.findById(orderDto.getOderId());
		if(orderE.isPresent()) {
			throw new OrderExistsException("Order already created");
		}
		
		
	   	OrderEntity orderEntity = new OrderEntity(); 
		BeanUtils.copyProperties(orderDto, orderEntity);
		orderEntity.setOrderTransactionId(UUID.randomUUID().toString());
		orderEntity =  ordrRepo.save(orderEntity);
		MDC.put("OrderTransaction-Id", orderEntity.getOrderTransactionId());
		log.info("Order Created");
		try {
			OrderEntityJaxbDto orderEntityJxb = new OrderEntityJaxbDto();
			BeanUtils.copyProperties(orderEntity, orderEntityJxb);
			JsonToXML.ObjectToXML(orderEntityJxb, JAXBContext.newInstance(OrderEntityJaxbDto.class));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		return orderEntity.getOderId();
	}
	
	
}
