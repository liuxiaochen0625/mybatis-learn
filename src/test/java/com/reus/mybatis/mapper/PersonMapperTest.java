package com.reus.mybatis.mapper;

import com.reus.mybatis.model.Person;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author reus
 * @version $Id: PersonMapperTest.java, v 0.1 2018-03-26 reus Exp $
 */
public class PersonMapperTest extends BaseMapperTest{

    @Test
    public void testSelectById(){
        SqlSession sqlSession = getSession();
        try {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            Person person = personMapper.selectById(3);
            System.out.println(person.getFirstName());
            System.out.println(person.getParent());
        }finally {
            sqlSession.close();
        }
    }

}