package com.zhb.mybatis.test;

import com.zhb.mybatis.mapper.DeptMapper;
import com.zhb.mybatis.mapper.EmpMapper;
import com.zhb.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;

public class ParameterTest {
    @Test
    public void GetAlluser() throws IOException {

        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
//        ParameterMapper mapper =  sqlSession.getMapper(ParameterMapper.class);
        //List<User> list= mapper.getAllUser();
//        list.forEach(User-> System.out.println(User));
//        System.out.println(mapper.GetUserById(2));
////        System.out.println(mapper.getCount());
//        System.out.println(mapper.getUserToMap(3));
//        System.out.println(mapper.getAllUserToMap());
//        System.out.println(mapper.getAllUserToMapInMap());
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        System.out.println(empMapper.getEmpAndDeptByEid(2));
        DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
        System.out.println(deptMapper.getDeptEmpByDid(1));
//        SpecialMapper specialMapper = sqlSession.getMapper(SpecialMapper.class);
//        System.out.println(specialMapper.testMohu("张三"));
//        System.out.println(specialMapper.deleteMore("3,4"));
//        System.out.println(specialMapper.getAllUser("t_user"));
//        User user=new User();
//        System.out.println(specialMapper.insertUser(user));
//        System.out.println(user.getId());

    }
}
