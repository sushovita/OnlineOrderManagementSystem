package com.example.ordermanagement.service;

import com.example.ordermanagement.entity.Order;
import com.example.ordermanagement.entity.User;
import com.example.ordermanagement.exception.ResourceNotFoundException;
import com.example.ordermanagement.repository.OrderRepository;
import com.example.ordermanagement.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    public OrderService(OrderRepository orderRepository,
                        UserRepository userRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
    }

    public Order createOrder(Long userId, Order order) {
        User user = userRepository.findById(userId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("User not found with id " + userId));

        Order newOrder = new Order(
                order.getProductName(),
                "CREATED",
                user
        );

        return orderRepository.save(newOrder);
    }

    public List<Order> getOrdersByUser(Long userId) {
        return orderRepository.findByUserId(userId);
    }
}
