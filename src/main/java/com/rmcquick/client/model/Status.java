package com.rmcquick.client.model;

import jakarta.persistence.*;

@Entity
@Table(name = "status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Integer accepted;

    @Column(nullable = false)
    private Integer notAccepted;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

    public Status() {
    }

    public Status(Integer accepted, Integer notAccepted) {
        this.accepted = accepted;
        this.notAccepted = notAccepted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccepted() {
        return accepted;
    }

    public void setAccepted(Integer accepted) {
        this.accepted = accepted;
    }

    public Integer getNotAccepted() {
        return notAccepted;
    }

    public void setNotAccepted(Integer notAccepted) {
        this.notAccepted = notAccepted;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
