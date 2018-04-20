package com.gds.szs.szs.api;

import com.gds.szs.szs.model.Books;
import com.gds.szs.szs.model.User;
import com.gds.szs.szs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/user/v1")
public class UserApi {

    @Autowired
    public UserService userService;

    @Autowired
    private Books books;

    @RequestMapping(value="/get", produces = "text/plain;charset=UTF-8")
    public String getUser(String username, String sex) {
        System.out.println(username);
        String result = userService.insert(username, sex);
        return result;
    }

    @RequestMapping(value="/list", produces = "application/json;charset=UTF-8")
    public List<User> getList() {
        List<User> user = userService.getUser();
        System.out.println(user.get(0));
        return user;
    }


    @RequestMapping(value="/index", produces = "text/plain;charset=UTF-8")
    public String index() {

        return "这是我第一个程序！" + books.getAuthor();
    }
}
