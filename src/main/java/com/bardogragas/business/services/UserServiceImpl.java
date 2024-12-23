package com.bardogragas.business.services;

import com.bardogragas.persistence.entities.User;
import com.bardogragas.persistence.repositories.UserRepository;
import com.bardogragas.dtos.inbound.CreateUserDTO;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public User createUser(CreateUserDTO createUserDTO) {
        User user = new User(
                createUserDTO.name(),
                createUserDTO.email(),
                createUserDTO.password()
        );
        return userRepository.save(user);
    }
}
