package com.example.Travelling.Service;

import com.example.Travelling.Model.User;

import java.util.List;

public interface UserService {
    User adduser(User user) throws Exception;
    User getUserById(Integer id) throws UserNotFoundException;
    List<User> getUser();
    User updateUser(Integer userId, User user)  throws UserNotFoundException;
    void deleteUser(Integer userId) throws UserNotFoundException;
}
