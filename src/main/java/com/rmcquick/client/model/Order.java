package com.rmcquick.client.model;

import com.rmcquick.client.model.Item;
import com.rmcquick.client.model.Restaurant;
import com.rmcquick.client.model.Status;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "restaurant_id", nullable = false)
    private Restaurant restaurant;

    @Column(nullable = false)
    private String preparationTime;

    @Column(nullable = false)
    private String receivedTime;

    @Column(nullable = false)
    private String deliveryStatus;

    @OneToMany(mappedBy = "order")
    private List<Item> items;

    @OneToOne
    @JoinColumn(name = "status_id")
    private Status status;

    public Order() {
    }

    public Order(String preparationTime, String receivedTime, String deliveryStatus) {
        this.preparationTime = preparationTime;
        this.receivedTime = receivedTime;
        this.deliveryStatus = deliveryStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
