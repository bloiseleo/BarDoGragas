package com.bardogragas.business.services;

import com.bardogragas.persistence.entities.User;
import com.bardogragas.dtos.inbound.CreateUserDTO;

public interface UserService {
    User createUser(CreateUserDTO createUserDTO);
}
