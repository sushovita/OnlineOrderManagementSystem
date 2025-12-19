package com.example.ordermanagement.mapper;

import com.example.ordermanagement.dto.OrderResponseDTO;
import com.example.ordermanagement.entity.Order;

public class OrderMapper {

    public static OrderResponseDTO toDTO(Order order) {
        return new OrderResponseDTO(
                order.getId(),
                order.getProductName(),
                order.getStatus(),
                order.getUser().getId()
        );
    }
}
