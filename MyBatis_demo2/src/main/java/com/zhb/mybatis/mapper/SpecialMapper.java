package com.zhb.mybatis.mapper;

import com.zhb.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SpecialMapper {

    List<User> testMohu(@Param("username") String username);

    int deleteMore(@Param("ids") String ids);

    List<User> getAllUser(@Param("tablename") String tablename);

    //* useGeneratedKeys：设置使用自增的主键 * keyProperty：因为增删改有统一的返回值是受影响的行数，因此只能将获取的自增的主键放在传输的参 数user对象的某个属性中
    int insertUser(User user);

}
