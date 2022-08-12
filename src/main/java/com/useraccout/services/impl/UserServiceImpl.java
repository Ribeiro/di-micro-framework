package com.useraccout.services.impl;

import com.useraccout.services.UserService;
import org.di.framework.annotations.Component;

@Component
public class UserServiceImpl implements UserService {

    @Override
    public String getUserName() {
        return "username";
    }
}
