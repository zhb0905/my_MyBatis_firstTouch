package com.zhb.mybatis.test;

import com.zhb.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class MyBatisTest {

    @Test
    public void testMyBatis() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder=
                new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        //int deleteResult = userMapper.deleteUser();
        int result = userMapper.insertUser();
        //sqlSession.commit();
//        int updateResult = userMapper.updateUser();

        //System.out.println(userMapper.getUserById());
        //System.out.println(userMapper.getUserList());
        System.out.println(userMapper.getUserById(5));
    }
}
