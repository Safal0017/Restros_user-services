package com.restaurant.userservices.repository;

import com.restaurant.userservices.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findByName(String name);

}
