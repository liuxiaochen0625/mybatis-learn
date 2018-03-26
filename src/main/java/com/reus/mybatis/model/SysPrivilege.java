/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

/**
 * 权限表
 * @author reus
 * @version $Id: SysPrivilege.java, v 0.1 2018-03-26 reus Exp $
 */
public class SysPrivilege {

    /** 权限ID */
    private Long   id;

    /** 权限名 */
    private String privilegeName;

    /** 权限url */
    private String privilegeUrl;

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
     * Getter method for property <tt>privilegeName</tt>.
     *
     * @return property value of privilegeName
     */
    public String getPrivilegeName() {
        return privilegeName;
    }

    /**
     * Setter method for property <tt>privilegeName</tt>.
     *
     * @param privilegeName value to be assigned to property privilegeName
     */
    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    /**
     * Getter method for property <tt>privilegeUrl</tt>.
     *
     * @return property value of privilegeUrl
     */
    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    /**
     * Setter method for property <tt>privilegeUrl</tt>.
     *
     * @param privilegeUrl value to be assigned to property privilegeUrl
     */
    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }

    @Override
    public String toString() {
        return "SysPrivilege{" + "id=" + id + ", privilegeName='" + privilegeName + '\''
               + ", privilegeUrl='" + privilegeUrl + '\'' + '}';
    }
}