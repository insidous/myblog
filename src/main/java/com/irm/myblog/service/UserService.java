package com.irm.myblog.service;

import com.irm.myblog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
