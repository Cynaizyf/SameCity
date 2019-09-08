package com.example.samecity.dao;

import com.example.samecity.model.UserDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {

    //通过用户名查询数据库中已经存在的用户名密码
    UserDomain FindU(@Param("username")String username, @Param("password") String password);

    //登录
    public UserDomain selectByLoginnameAndPassword(@Param("username")String username, @Param("password") String password);
    UserDomain login(String username,String password);

    //查询所有用户名
    List<UserDomain> findAllUserName();

    //插入用户名密码
    public int addM(UserDomain userDomain);

    //查询数量
    int count(UserDomain userDomain);
}
