package com.example.lakesideHotel_Backend.service;

import com.example.lakesideHotel_Backend.model.User;

import java.util.List;

/**
 * @author Simpson Alfred
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}