package com.bardogragas.dtos.outbound;

import com.bardogragas.persistence.entities.User;

public record UserCreatedDTO(
        long id,
        String name,
        String email,
        String profileIconName
) {
    public static UserCreatedDTO fromDomain(User entity) {
        return new UserCreatedDTO(
                entity.getId(),
                entity.getName(),
                entity.getEmail(),
                entity.getProfileIconName()
        );
    }
}
