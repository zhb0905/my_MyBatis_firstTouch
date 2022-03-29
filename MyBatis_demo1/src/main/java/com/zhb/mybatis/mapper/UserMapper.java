package com.zhb.mybatis.mapper;

import com.zhb.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    int insertUser();

    int deleteUser();

    int updateUser();

    User getUserById();

    User getUserById(@Param("id") int id);

    List<User> getUserList();
}
