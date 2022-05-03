package com.television.coursework.Service.Impl;


import com.television.coursework.Model.User;
import com.television.coursework.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

    @Override
    public User FindById(Integer userid) {
        return null;
    }

    @Override
    public List<User> AllUsers() {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public void delete(User user) {

    }
}
