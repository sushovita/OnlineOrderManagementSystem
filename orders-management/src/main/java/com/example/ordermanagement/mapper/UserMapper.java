package com.example.ordermanagement.mapper;

import com.example.ordermanagement.dto.UserRequestDTO;
import com.example.ordermanagement.dto.UserResponseDTO;
import com.example.ordermanagement.entity.User;

public class UserMapper {

    public static User toEntity(UserRequestDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        return user;
    }

    public static UserResponseDTO toDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        return dto;
    }
}
