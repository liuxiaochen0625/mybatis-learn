/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

/**
 * 角色权限表
 * @author reus
 * @version $Id: SysRolePrivilege.java, v 0.1 2018-03-26 reus Exp $
 */
public class SysRolePrivilege {

    /** 角色ID */
    private Long roleId;

    /** 权限ID */
    private Long privilegeId;

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

    /**
     * Getter method for property <tt>privilegeId</tt>.
     *
     * @return property value of privilegeId
     */
    public Long getPrivilegeId() {
        return privilegeId;
    }

    /**
     * Setter method for property <tt>privilegeId</tt>.
     *
     * @param privilegeId value to be assigned to property privilegeId
     */
    public void setPrivilegeId(Long privilegeId) {
        this.privilegeId = privilegeId;
    }

    @Override
    public String toString() {
        return "SysRolePrivilege{" + "roleId=" + roleId + ", privilegeId=" + privilegeId + '}';
    }
}