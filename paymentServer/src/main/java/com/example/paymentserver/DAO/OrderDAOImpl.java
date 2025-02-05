package com.example.paymentserver.DAO;

import com.example.paymentserver.Entity.OrderEntity;
import com.example.paymentserver.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@Repository
public class OrderDAOImpl implements OrderDAO{
    private final OrderRepository orderRepository;

    @Autowired
    public OrderDAOImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void createOrder(OrderEntity orderEntity) {
        Map<String, Object> result = new HashMap<>();

        orderEntity.updateDateTime(LocalDateTime.now());

        orderRepository.save(orderEntity);
    }

    @Override
    public OrderEntity readOrder(String orderId) {
        return orderRepository.getReferenceById(orderId);
    }

    @Override
    public void deleteOrder(OrderEntity orderEntity){
        orderRepository.delete(orderEntity);
    }
}
