package com.reus.mybatis.mapper;

import com.reus.mybatis.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author reus
 * @version $Id: CountryMapperTest.java, v 0.1 2018-03-23 reus Exp $
 */
public class CountryMapperTest {
    private static SqlSessionFactory factory;

    @BeforeClass
    public static void init() {
        try {
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            factory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectAll() {
        SqlSession sqlSession = factory.openSession();
        try {
            List<Country> countries = sqlSession.selectList("selectAll");
            for (Country country : countries) {
                System.out.println(country);
            }
        } finally {
            sqlSession.close();
        }
    }

}
