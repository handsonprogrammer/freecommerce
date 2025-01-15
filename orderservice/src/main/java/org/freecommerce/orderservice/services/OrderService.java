package org.freecommerce.orderservice.services;

import org.freecommerce.orderservice.db.entities.Orders;
import org.freecommerce.orderservice.db.repositories.OrdersRepository;
import org.freecommerce.orderservice.dto.OrderDto;
import org.hibernate.type.descriptor.DateTimeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.Optional;

@Service
public class OrderService {

    private OrdersRepository ordersRepository;

    @Autowired
    public OrderService(OrdersRepository ordersRepository){
        this.ordersRepository = ordersRepository;
    }

    public Optional<OrderDto> findById(Long id) {
        Optional<Orders> orders =  ordersRepository.findById(id);
        if(orders.isPresent()){
            Orders order = orders.get();
            OrderDto orderData = new OrderDto();
            orderData.setOrdersId(order.getOrdersId());
            orderData.setExtOrderId(order.getExtOrderId());
            orderData.setCurrency(order.getCurrency());
            orderData.setLocked(order.isLocked());
            orderData.setStatus(order.getStatus());
            orderData.setTotalProduct(order.getTotalProduct());
            orderData.setTotalTax(order.getTotalTax());
            return Optional.of(orderData);
        }else{
            return Optional.empty();
        }
    }

    public OrderDto createOrder(OrderDto orderDto) {

        Orders orderData = new Orders();
        orderData.setCurrency(orderDto.getCurrency());
        orderData.setLocked(orderDto.isLocked());
        orderData.setStatus(orderDto.getStatus());
        orderData.setTotalProduct(orderDto.getTotalProduct());
        orderData.setTotalTax(orderDto.getTotalTax());
        ordersRepository.save(orderData);

        return orderDto;
    }

    private void deleteById(Long id) {
        ordersRepository.deleteById(id);
    }


}
