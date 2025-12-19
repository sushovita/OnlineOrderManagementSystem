package com.example.ordermanagement.controller;

import com.example.ordermanagement.dto.UserRequestDTO;
import com.example.ordermanagement.dto.UserResponseDTO;
import com.example.ordermanagement.mapper.UserMapper;
import com.example.ordermanagement.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // CREATE USER
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserResponseDTO createUser(@Valid @RequestBody UserRequestDTO dto) {
        return UserMapper.toDTO(
                userService.createUser(UserMapper.toEntity(dto))
        );
    }

    // GET USER BY ID
    @GetMapping("/{id}")
    public UserResponseDTO getUser(@PathVariable Long id) {
        return UserMapper.toDTO(
                userService.getUserById(id)
        );
    }

    // DELETE USER
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
