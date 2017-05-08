package com.dover.authentication.dao;

import com.dover.authentication.model.Login;
import com.dover.authentication.model.User;

public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}