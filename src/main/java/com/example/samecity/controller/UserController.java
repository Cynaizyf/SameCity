package com.example.samecity.controller;

import com.example.samecity.model.UserDomain;
import com.example.samecity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserService userServcie;
    @RequestMapping("/checklogin")
    @ResponseBody
    public UserDomain checklogin(String username, String paasword, HttpSession session){
        UserDomain user =userServcie.login(username, paasword);
        System.out.println(user);
        if(user!=null) {
            session.setAttribute("user_session", user);
            return user;
        }else {
            return null;
        }
    }
}
