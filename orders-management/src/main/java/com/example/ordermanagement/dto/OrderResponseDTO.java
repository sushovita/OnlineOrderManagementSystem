package com.example.ordermanagement.dto;

public class OrderResponseDTO {

    private Long id;
    private String productName;
    private String status;
    private Long userId;

    public OrderResponseDTO(Long id, String productName,
                            String status, Long userId) {
        this.id = id;
        this.productName = productName;
        this.status = status;
        this.userId = userId;
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

    public Long getUserId() {
        return userId;
    }
}
