package com.gds.szs.szs.service;

import com.gds.szs.szs.model.User;

import java.util.List;

public interface UserService {

    String insert(String username, String sex);

    List<User> getUser();

}
