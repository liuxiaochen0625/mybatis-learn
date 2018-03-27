package com.reus.mybatis.mapper;

import com.reus.mybatis.model.Dept;

import java.io.IOException;

/**
 * @author reus
 * @version $Id: DeptMapper.java, v 0.1 2018-03-27 reus Exp $
 */
public interface DeptMapper {

    /**
     * 查询指定记录
     * @return
     * @throws IOException
     */
    Dept findById(Integer id) throws IOException;

}
