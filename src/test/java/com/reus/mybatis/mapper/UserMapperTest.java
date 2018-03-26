package com.reus.mybatis.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.reus.mybatis.model.SysUser;

import java.util.Date;

/**
 * @author reus
 * @version $Id: UserMapperTest.java, v 0.1 2018-03-26 reus Exp $
 */
public class UserMapperTest extends BaseMapperTest {

    @Test
    public void selectById() throws Exception {
        SqlSession sqlSession = getSession();
        try {
            SysUser sysUser = sqlSession.selectOne("selectById", 1);
            System.out.println(sysUser);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void selectById2() throws Exception {
        SqlSession sqlSession = getSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = userMapper.selectById(1L);
            System.out.println(sysUser);
        } finally {
            sqlSession.close();
        }
    }

    @Test
    public void insetUser(){
        SqlSession sqlSession = getSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser user = new SysUser();
            user.setUserName("lxq");
            user.setUseEmail("lxq@mybatis.com");
            user.setUserPassword("123456");
            user.setUserInfo("lxq");
            user.setCreateDate(new Date());
            int id = userMapper.insertUser(user);
            System.out.println(id);
            System.out.println(user.getId());
        }finally {
            sqlSession.close();
        }
    }

}