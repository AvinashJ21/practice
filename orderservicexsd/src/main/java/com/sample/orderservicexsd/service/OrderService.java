package com.sample.orderservicexsd.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generated.sources.ShippingOrder;
import com.sample.orderservicexsd.dto.OrderRequestDto;
import com.sample.orderservicexsd.entity.OrderEntity;
import com.sample.orderservicexsd.exception.OrderExistsException;
import com.sample.orderservicexsd.repo.OrderReposiory;
import com.sample.orderservicexsd.util.ObjectToXML;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;

@Service
public class OrderService {

	@Autowired
	OrderReposiory orderRepo;

	public Long createOrder(OrderRequestDto orderDto) {

		Optional<OrderEntity> order = orderRepo.findById(orderDto.getOrderId());
		if (order.isPresent())
			throw new OrderExistsException("Order already exists");
		OrderEntity orderEntity = new OrderEntity();
		BeanUtils.copyProperties(orderDto, orderEntity);
		orderEntity = orderRepo.save(orderEntity);
		try {
			ShippingOrder orderEntityJxb = new ShippingOrder();
			BeanUtils.copyProperties(orderEntity, orderEntityJxb);
			ObjectToXML.mappToXML(orderEntityJxb, JAXBContext.newInstance(ShippingOrder.class));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return orderEntity.getOrderId();

	}

	public OrderRequestDto getOrderDetails(Long id) {

		OrderRequestDto ordrDto = null;

		Optional<OrderEntity> oe = orderRepo.findById(id);
		if (oe.isPresent()) {
			ordrDto = new OrderRequestDto();
			BeanUtils.copyProperties(oe.get(), ordrDto);
		} else {
			throw new OrderExistsException("Order not found please check order Id");
		}
		return ordrDto;
	}

}
