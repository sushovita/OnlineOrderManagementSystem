package com.example.ordermanagement.controller;

import com.example.ordermanagement.dto.OrderRequestDTO;
import com.example.ordermanagement.dto.OrderResponseDTO;
import com.example.ordermanagement.entity.Order;
import com.example.ordermanagement.mapper.OrderMapper;
import com.example.ordermanagement.service.OrderService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/{userId}")
    public OrderResponseDTO createOrder(
            @PathVariable Long userId,
            @Valid @RequestBody OrderRequestDTO dto) {

        Order order = orderService.createOrder(userId, dto.getProductName());
        return OrderMapper.toDTO(order);
    }

    @GetMapping("/user/{userId}")
    public List<OrderResponseDTO> getUserOrders(@PathVariable Long userId) {
        return orderService.getOrdersByUser(userId)
                .stream()
                .map(OrderMapper::toDTO)
                .collect(Collectors.toList());
    }
}
