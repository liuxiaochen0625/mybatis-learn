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

    /**
     * 根据ID查询用户
     * @param id
     * @return
     */
    SysUser selectById(Long id);

    /**
     * 新增用户
     * @param sysUser
     * @return
     */
    int insertUser(SysUser sysUser);

}