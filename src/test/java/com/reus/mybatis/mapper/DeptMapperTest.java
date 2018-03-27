package com.reus.mybatis.mapper;

import com.reus.mybatis.model.Dept;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author reus
 * @version $Id: DeptMapperTest.java, v 0.1 2018-03-27 reus Exp $
 */
public class DeptMapperTest extends BaseMapperTest {
    @Test
    public void findById() throws Exception {

        SqlSession sqlSession = getSession();
        try {
            DeptMapper deptMapper = sqlSession.getMapper(DeptMapper.class);
            Dept dept = deptMapper.findById(1);
            System.out.println(dept.getDeptname());
            System.out.println(dept.getEmp());
        } finally {
            sqlSession.close();
        }
    }

}