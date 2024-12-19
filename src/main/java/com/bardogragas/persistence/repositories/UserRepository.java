package com.bardogragas.persistence.repositories;

import com.bardogragas.persistence.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> { }
