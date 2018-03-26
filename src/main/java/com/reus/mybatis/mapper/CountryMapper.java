/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.mapper;

import com.reus.mybatis.model.Country;

import java.util.List;

/**
 * @author reus
 * @version $Id: CountryMapper.java, v 0.1 2018-03-23 reus Exp $
 */
public interface CountryMapper {

    List<Country> selectAll();

}