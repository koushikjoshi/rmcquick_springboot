package com.rmcquick.client.model;

import jakarta.persistence.*;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "accepted")
    private Integer accepted;

    @Column(name = "notaccepted")
    private Integer notaccepted;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "new_order_id", referencedColumnName = "id")
    private NewOrder newOrder;

    public Status() {}

    public Status(Integer accepted, Integer notaccepted, NewOrder newOrder, Long id) {
        this.newOrder = newOrder;
        this.id = id;
        this.accepted = accepted;
        this.notaccepted = notaccepted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccepted() {
        return accepted;
    }

    public void setAccepted(int accepted) {
        this.accepted = accepted;
    }

    public int getNotaccepted() {
        return notaccepted;
    }

    public void setNotaccepted(int notaccepted) {
        this.notaccepted = notaccepted;
    }

    public NewOrder getNewOrder() {
        return newOrder;
    }

    public void setNewOrder(NewOrder newOrder) {
        this.newOrder = newOrder;
    }
}
