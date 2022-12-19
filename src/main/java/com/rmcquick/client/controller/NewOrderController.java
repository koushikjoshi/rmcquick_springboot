package com.rmcquick.client.controller;

import com.rmcquick.client.exceptions.ResourceNotFoundException;
import com.rmcquick.client.model.NewOrder;
import com.rmcquick.client.repository.NewOrderRepository;
import com.rmcquick.client.service.NewOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.persistence.*;
import java.util.List;


@RestController
@RequestMapping("/api/neworders")
public class NewOrderController {

    private final NewOrderService newOrderService;

    @Autowired
    public NewOrderController(NewOrderService newOrderService) {
        this.newOrderService = newOrderService;
    }

    @PostMapping
    public ResponseEntity<NewOrder> createNewOrder(@RequestBody NewOrder newOrder) {
        NewOrder createdNewOrder = newOrderService.createNewOrder(newOrder);
        return ResponseEntity.ok(createdNewOrder);
    }

    @GetMapping
    public ResponseEntity<List<NewOrder>> getAllNewOrders() {
        List<NewOrder> newOrders = newOrderService.getAllNewOrders();
        return ResponseEntity.ok(newOrders);
    }

    @PutMapping("/{id}")
    public ResponseEntity<NewOrder> updateNewOrder(@PathVariable Long id, @RequestBody NewOrder newOrder) {
        NewOrder updatedNewOrder = newOrderService.updateNewOrder(id, newOrder);
        return ResponseEntity.ok(updatedNewOrder);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteNewOrder(@PathVariable Long id) {
        newOrderService.deleteNewOrder(id);
        return ResponseEntity.noContent().build();
    }
}
