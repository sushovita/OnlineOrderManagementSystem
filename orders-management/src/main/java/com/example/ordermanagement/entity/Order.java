package com.example.ordermanagement.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private String status;

    @ManyToOne
    private User user;

    public Order() {}

    public Order(String productName, String status, User user) {
        this.productName = productName;
        this.status = status;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getStatus() {
        return status;
    }

    public User getUser() {
        return user;
    }
}
