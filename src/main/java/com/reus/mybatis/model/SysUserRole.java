/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

/**
 * 用户角色表
 * @author reus
 * @version $Id: SysUserRole.java, v 0.1 2018-03-26 reus Exp $
 */
public class SysUserRole {

    /** 用户ID */
    private Long userId;

    /** 角色ID */
    private Long roleId;

    /**
     * Getter method for property <tt>userId</tt>.
     *
     * @return property value of userId
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Setter method for property <tt>userId</tt>.
     *
     * @param userId value to be assigned to property userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * Getter method for property <tt>roleId</tt>.
     *
     * @return property value of roleId
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * Setter method for property <tt>roleId</tt>.
     *
     * @param roleId value to be assigned to property roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "SysUserRole{" + "userId=" + userId + ", roleId=" + roleId + '}';
    }
}