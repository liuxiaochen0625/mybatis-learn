/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.mapper;

import com.reus.mybatis.model.SysUser;

/**
 * @author reus
 * @version $Id: UserMapper.java, v 0.1 2018-03-26 reus Exp $
 */
public interface UserMapper {

    SysUser selectById(Long id);

}