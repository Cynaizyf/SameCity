package com.example.samecity.controller;

import com.example.samecity.model.UserDomain;
import com.example.samecity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    /**
     * 删除
     * @param ids
     * @return
     */
    @RequestMapping("delete")
    public ModelAndView delete(int ids) {
        userServcie.delete(ids);
        ModelAndView mav = new ModelAndView("redirect:/tiao");
        return mav;
    }

    // 单条明细修改跳转到修改页面
    @RequestMapping("editgo")
    public ModelAndView editgo(int ids) {
        UserDomain c = userServcie.get(ids);
        ModelAndView mav = new ModelAndView("editgo");
        mav.addObject("c", c);
        return mav;
    }

    /**
     * 修改
     * @param userDomain
     * @return
     */
    @RequestMapping("edit")
    public ModelAndView edit(UserDomain userDomain) {
        int edit = userServcie.editM(userDomain);
        System.out.println(edit);
        ModelAndView mav = new ModelAndView("redirect:/tiao");
        return mav;
    }

    /**
     * 模糊查询
     * @param username
     * @return
     */
    @RequestMapping("/findsur")
    @ResponseBody
    public String findUser(Model model,String username){
        List<UserDomain> list = userServcie.findUser(username);
        if (list.size() != 0){
            System.out.println(list);
            model.addAttribute("userList",list);
            return "userlist";
        }else {
            System.out.println("执行null");
            return null;
        }
    }
}
