package com.cmarchive.bank.bankoauth2authorizationserver.controller;

import com.cmarchive.bank.bankoauth2authorizationserver.domaine.User;
import com.cmarchive.bank.bankoauth2authorizationserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/me")
    public User user(Principal principal) {
        User user = userService.findByEmail(principal.getName());
        return user;
    }
}
