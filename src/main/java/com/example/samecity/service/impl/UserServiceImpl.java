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

    //登录
    @Override
    public UserDomain login(String username, String password) {
        return userDao.selectByLoginnameAndPassword(username,password);
    }

    @Override
    public UserDomain get(int ids) {
        return userDao.getM(ids);
    }

    @Override
    public List<UserDomain> findU() {
        return userDao.findU();
    }

    @Override
    public int addM(UserDomain userDomain) {
        return userDao.addM(userDomain);
    }

    @Override
    public int count(UserDomain userDomain) {
        return userDao.count(userDomain);
    }

    @Override
    public void delete(int ids) {
        userDao.deleteM(ids);
    }

    @Override
    public int editM(UserDomain userDomain) {
        return userDao.editM(userDomain);
    }

    @Override
    public List<UserDomain> findUser(String username) {
        return userDao.findUser(username);
    }
}
