package com.example.samecity.dao;

import com.example.samecity.model.UserDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("mapper")
public interface UserDao {

    //登录
    public UserDomain selectByLoginnameAndPassword(@Param("username")String username, @Param("password") String password);
    UserDomain login(String username,String password);

    //查询所有用户名
    List<UserDomain> findU();

    //插入用户名密码
    public int addM(UserDomain userDomain);

    //查询数量
    int count(UserDomain userDomain);

    //模糊查询
    public List<UserDomain> looks(String username);

}
