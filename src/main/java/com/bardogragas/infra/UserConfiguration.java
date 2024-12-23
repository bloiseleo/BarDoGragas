package com.bardogragas.infra;

import com.bardogragas.business.services.UserService;
import com.bardogragas.business.services.UserServiceImpl;
import com.bardogragas.persistence.repositories.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
    @Bean
    public UserService userService(UserRepository userRepository) {
        return new UserServiceImpl(userRepository);
    }
}
