package com.rmcquick.client.model;

import jakarta.persistence.*;

import java.util.*;

@Entity
@Table(name = "neworders")
public class NewOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "restaurant_id")
    private String restaurantId;

    @Column(name = "preparation_time")
    private String preparationTime;

    @Column(name = "recived_time")
    private String recivedTime;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Status status;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "newOrder")
    private List<Item> items;

    @Column(name = "deliver_status")
    private String deliverStatus;

    public NewOrder() {}

    public NewOrder(String restaurantId, String preparationTime, String recivedTime, Status status,
                    List<Item> items, String deliverStatus) {
        this.restaurantId = restaurantId;
        this.preparationTime = preparationTime;
        this.recivedTime = recivedTime;
        this.status = status;
        this.items = items;
        this.deliverStatus = deliverStatus;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(String preparationTime) {
        this.preparationTime = preparationTime;
    }

    public String getRecivedTime() {
        return recivedTime;
    }

    public void setRecivedTime(String recivedTime) {
        this.recivedTime = recivedTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getDeliverStatus() {
        return deliverStatus;
    }

    public void setDeliverStatus(String deliverStatus) {
        this.deliverStatus = deliverStatus;
    }
}
