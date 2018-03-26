package com.reus.mybatis.mapper;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.reus.mybatis.model.SysUser;

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

}