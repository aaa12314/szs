package com.gds.szs.szs.service.impl;

import com.gds.szs.szs.model.User;
import com.gds.szs.szs.repository.UserDAO;
import com.gds.szs.szs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public String insert(String username, String sex) {
        User user = new User();
        user.setUsername(username);
        user.setSex(sex);
        userDAO.insert(user);
        return "请求成功";
    }

    @Override
    public List<User> getUser() {
        List<User> users = userDAO.getUser();
        return users;
    }
}
