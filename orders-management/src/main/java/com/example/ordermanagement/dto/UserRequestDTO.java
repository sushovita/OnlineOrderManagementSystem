package com.example.ordermanagement.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class UserRequestDTO {

    @NotBlank
    private String name;

    @Email
    @NotBlank
    private String email;

    // ✅ REQUIRED GETTERS
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // (Optional but good practice)
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
