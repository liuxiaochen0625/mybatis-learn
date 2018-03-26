/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

import java.util.Date;

/**
 * 角色表
 * @author reus
 * @version $Id: SysRole.java, v 0.1 2018-03-26 reus Exp $
 */
public class SysRole {

    /** 角色ID */
    private Long    id;

    /** 角色名 */
    private String  roleName;

    /** 是否可用 */
    private Integer enabled;

    /** 创建者 */
    private Long    createBy;

    /** 创建时间 */
    private Date    createTime;

    /**
     * Getter method for property <tt>id</tt>.
     *
     * @return property value of id
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter method for property <tt>id</tt>.
     *
     * @param id value to be assigned to property id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Getter method for property <tt>roleName</tt>.
     *
     * @return property value of roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Setter method for property <tt>roleName</tt>.
     *
     * @param roleName value to be assigned to property roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Getter method for property <tt>enabled</tt>.
     *
     * @return property value of enabled
     */
    public Integer getEnabled() {
        return enabled;
    }

    /**
     * Setter method for property <tt>enabled</tt>.
     *
     * @param enabled value to be assigned to property enabled
     */
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter method for property <tt>createBy</tt>.
     *
     * @return property value of createBy
     */
    public Long getCreateBy() {
        return createBy;
    }

    /**
     * Setter method for property <tt>createBy</tt>.
     *
     * @param createBy value to be assigned to property createBy
     */
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    /**
     * Getter method for property <tt>createTime</tt>.
     *
     * @return property value of createTime
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createTime</tt>.
     *
     * @param createTime value to be assigned to property createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SysRole{" + "id=" + id + ", roleName='" + roleName + '\'' + ", enabled=" + enabled
               + ", createBy=" + createBy + ", createTime=" + createTime + '}';
    }
}