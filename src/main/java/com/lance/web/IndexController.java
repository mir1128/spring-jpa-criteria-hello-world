package com.lance.web;


import com.lance.entity.UserEntity;
import com.lance.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {" ", "/", "/index"})
    public String index() {
        return "index.jsp";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public ResponseEntity createUser() {
        if (userService.createUser()) {
            return new ResponseEntity("success.", HttpStatus.CREATED);
        }
        return new ResponseEntity("error", HttpStatus.BAD_REQUEST);
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ResponseEntity getUser() {

        List<UserEntity> users = userService.getUsers();
        return new ResponseEntity(users, HttpStatus.CREATED);
    }
}

