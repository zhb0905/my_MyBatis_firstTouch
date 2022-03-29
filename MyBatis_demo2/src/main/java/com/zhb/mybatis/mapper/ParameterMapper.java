package com.zhb.mybatis.mapper;

import com.zhb.mybatis.bean.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {

    List<User> getAllUser();

    User GetUserById(@Param("id") int id);

    int getCount();

    Map<String,Object> getUserToMap(@Param("id") int id);

    List<Map<String,Object>> getAllUserToMap();

    @MapKey(value = "id")
    Map<String,Object > getAllUserToMapInMap();
}
