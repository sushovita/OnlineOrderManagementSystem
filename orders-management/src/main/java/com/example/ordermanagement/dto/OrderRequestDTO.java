package com.example.ordermanagement.dto;

import jakarta.validation.constraints.NotBlank;

public class OrderRequestDTO {

    @NotBlank(message = "Product name cannot be empty")
    private String productName;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
