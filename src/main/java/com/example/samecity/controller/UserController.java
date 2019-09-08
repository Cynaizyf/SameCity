package com.example.samecity.controller;

import com.example.samecity.model.UserDomain;
import com.example.samecity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userServcie;

    /**
     * 登录
     * @param username
     * @param password
     * @param session
     * @return
     */
    @RequestMapping("/checklogin")
    @ResponseBody
    public UserDomain checklogin(String username, String password, HttpSession session){
        UserDomain user =userServcie.login(username, password);
        System.out.println(user);
        if(user!=null) {
            session.setAttribute("user_session", user);
            return user;
        }else {
            return null;
        }
    }

    /**
     * 注册
     * @param userDomain
     * @return
     */
    @ResponseBody
    @RequestMapping("/registration")
    public String registration(UserDomain userDomain,String username,String password){
        int count = userServcie.count(userDomain);
        System.out.println(count);
        if (count == 0) {
            int addM = userServcie.addM(userDomain);
            System.out.println(addM);
            if (addM > 0) {
                return "success";
            } else {
                return null;
            }
        }else {
            return null;
        }
    }
}
