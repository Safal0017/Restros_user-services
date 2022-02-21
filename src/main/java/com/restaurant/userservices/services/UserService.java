package com.restaurant.userservices.services;

import com.restaurant.userservices.entities.Role;
import com.restaurant.userservices.entities.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();

}
