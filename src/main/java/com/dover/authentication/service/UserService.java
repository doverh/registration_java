package com.dover.authentication.service;

import com.dover.authentication.model.*;

public interface UserService {

  void register(User user);

  User validateUser(Login login);
}
