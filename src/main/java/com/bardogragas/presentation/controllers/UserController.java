package com.bardogragas.presentation.controllers;

import com.bardogragas.business.services.UserService;
import com.bardogragas.persistence.entities.User;
import com.bardogragas.dtos.inbound.CreateUserDTO;
import com.bardogragas.dtos.outbound.ApiResponseData;
import com.bardogragas.dtos.outbound.UserCreatedDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping
    public ApiResponseData<UserCreatedDTO> createUser(@RequestBody CreateUserDTO createUserDTO) {
        User user = userService.createUser(createUserDTO);
        return new ApiResponseData<>(
                "User created successfully",
                HttpStatus.CREATED,
                UserCreatedDTO.fromDomain(user)
        );
    }
}
