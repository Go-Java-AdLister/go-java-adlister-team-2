package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.util.List;

public interface Users {
    // find a user from the users table using only the username
    User findByUsername(String username);
    // add a user too the users table
    Long insert(User user);
   // find a user from the users table using only the user id
    User findById(long id);
}
