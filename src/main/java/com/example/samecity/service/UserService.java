package com.example.samecity.service;

import com.example.samecity.model.UserDomain;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    //登录
    UserDomain login(String username,String password);

    // 查询单条
    UserDomain get(int ids);

    //查询所有用户名
    List<UserDomain> findU();

    //插入用户名密码
    public int addM(UserDomain userDomain);

    //查询数量
    int count(UserDomain userDomain);

    //删除
    void delete(int ids);

    // 修改
    int edit(UserDomain userDomain);

    //模糊查询
    List<UserDomain> findUser(@Param("username")String username);
}
