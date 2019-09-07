package com.example.samecity.service;

import com.example.samecity.model.UserDomain;

import java.util.List;

public interface UserService {
    //通过用户名查询数据库中已经存在的用户名密码
    UserDomain FindU(UserDomain userDomain);

    UserDomain login(String username,String password);

    //查询所有用户名
    List<UserDomain> findAllUserName();

    //插入用户名密码
    int insertUserPwd(UserDomain userDomain);
}
