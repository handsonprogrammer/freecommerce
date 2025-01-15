package org.freecommerce.orderservice.controllers;

import org.freecommerce.orderservice.db.repositories.OrdersRepository;
import org.freecommerce.orderservice.dto.OrderDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrdersController {

    OrdersRepository ordersRepository;

    @Autowired
    public OrdersController(OrdersRepository ordersRepository){
        this.ordersRepository = ordersRepository;
    }

    @GetMapping("/{orderId}")
    public OrderDto getOrderById(@PathVariable Long orderId){
        ordersRepository.findById(orderId);
        return new OrderDto();
    }
}
