package com.bardogragas.dtos.inbound;

public record CreateUserDTO(
        String name,
        String password,
        String email
) { }
