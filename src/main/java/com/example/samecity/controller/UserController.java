package com.example.samecity.controller;

import com.example.samecity.model.UserDomain;
import com.example.samecity.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    /**
     * 用户查询
     * 页面跳转
     * @param model
     * @return
     */
    @RequestMapping("/tiao")
    public String findU(Model model){
        List<UserDomain> list = userServcie.findU();
        System.out.println(list);
        model.addAttribute("userList",list);
        return "userlist";
    }

    @RequestMapping("/finds")
    @ResponseBody
    public List<UserDomain> findsUser(@RequestParam(value="username")String username, HttpSession session, @RequestParam(value="pageNo",required=false,defaultValue="1")int pageNo, @RequestParam(value="pageSize",required=false,defaultValue="13")int pageSize){
        System.out.println(username);
        PageHelper.startPage(pageNo, pageSize);
        List<UserDomain> list=userServcie.findUser(username);
        PageInfo<UserDomain> page=new PageInfo<UserDomain>(list);
        session.setAttribute("users", list);
        return  list;
    }
}
