package com.television.coursework.Service;

import com.television.coursework.Model.User;

import java.util.List;

public interface UserService {

    User FindById(Integer userid);

    List<User> AllUsers();

    User create(User user);

    void delete(User user);


}
