package com.reus.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.reus.mybatis.model.Country;

/**
 * @author reus
 * @version $Id: CountryMapperTest.java, v 0.1 2018-03-23 reus Exp $
 */
public class CountryMapperTest extends BaseMapperTest {
    @Test
    public void testSelectAll() {
        SqlSession sqlSession = getSession();
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
