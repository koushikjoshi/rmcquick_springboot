package com.rmcquick.client.service;

import com.rmcquick.client.exceptions.ResourceNotFoundException;
import com.rmcquick.client.model.NewOrder;
import com.rmcquick.client.repository.NewOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewOrderService {

    private final NewOrderRepository newOrderRepository;

    @Autowired
    public NewOrderService(NewOrderRepository newOrderRepository) {
        this.newOrderRepository = newOrderRepository;
    }

    public NewOrder createNewOrder(NewOrder newOrder) {
        return newOrderRepository.save(newOrder);
    }

    public List<NewOrder> getAllNewOrders() {
        // Fetch neworders and their associated status using a left outer join
        List<NewOrder> newOrders = newOrderRepository.findAll();
        return newOrders;
    }

    public NewOrder updateNewOrder(Long id, NewOrder newOrder) {
        newOrder.setId(id);
        return newOrderRepository.save(newOrder);
    }

    public void deleteNewOrder(Long id) {
        newOrderRepository.deleteById(id);
    }
}