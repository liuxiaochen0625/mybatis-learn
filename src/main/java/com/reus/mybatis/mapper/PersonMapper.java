/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.mapper;

import com.reus.mybatis.model.Person;

/**
 * @author reus
 * @version $Id: PersonMapper.java, v 0.1 2018-03-26 reus Exp $
 */
public interface PersonMapper {

    Person selectById(int id);

}