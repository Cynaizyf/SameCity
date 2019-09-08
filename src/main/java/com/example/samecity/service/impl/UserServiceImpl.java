package com.example.samecity.service.impl;

import com.example.samecity.dao.UserDao;
import com.example.samecity.model.UserDomain;
import com.example.samecity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public UserDomain FindU(String username, String password) {
        return userDao.FindU(username,password);
    }

    //登录
    @Override
    public UserDomain login(String username, String password) {
        return userDao.selectByLoginnameAndPassword(username,password);
    }

    @Override
    public List<UserDomain> findAllUserName() {
        return userDao.findAllUserName();
    }

    @Override
    public int addM(UserDomain userDomain) {
        return userDao.addM(userDomain);
    }

    @Override
    public int count(UserDomain userDomain) {
        return userDao.count(userDomain);
    }
}
