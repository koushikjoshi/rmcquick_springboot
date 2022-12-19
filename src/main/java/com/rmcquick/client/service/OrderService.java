package com.rmcquick.client.service;

import com.rmcquick.client.model.Order;
import com.rmcquick.client.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public Order save(Order order) {
        return orderRepository.save(order);
    }

    public Order getById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    public List<Order> getAll() {
        return orderRepository.findAll();
    }

    public void deleteById(Long id) {
        orderRepository.deleteById(id);
    }
}
