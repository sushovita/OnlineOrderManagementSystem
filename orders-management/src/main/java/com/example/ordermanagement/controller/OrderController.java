package com.example.ordermanagement.controller;

import com.example.ordermanagement.entity.Order;
import com.example.ordermanagement.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/{userId}")
    public Order createOrder(@PathVariable Long userId,
                            @Valid @RequestBody Order order) {
        return orderService.createOrder(userId, order);
    }

    @GetMapping("/user/{userId}")
    public List<Order> getUserOrders(@PathVariable Long userId) {
        return orderService.getOrdersByUser(userId);
    }
}
