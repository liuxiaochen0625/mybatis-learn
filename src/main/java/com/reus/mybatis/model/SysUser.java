/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

import java.util.Arrays;
import java.util.Date;

/**
 * 用户表
 * @author reus
 * @version $Id: SysUser.java, v 0.1 2018-03-26 reus Exp $
 */
public class SysUser {

    /** 用户ID */
    private Long   id;

    /** 用户名 */
    private String userName;

    /** 用户密码 */
    private String userPassword;

    /** 用户Email */
    private String userEmail;

    /** 简介 */
    private String userInfo;

    /** 头像 */
    private byte[] headImg;

    /** 创建时间 */
    private Date   createTime;

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
     * Getter method for property <tt>userName</tt>.
     *
     * @return property value of userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Setter method for property <tt>userName</tt>.
     *
     * @param userName value to be assigned to property userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Getter method for property <tt>userPassword</tt>.
     *
     * @return property value of userPassword
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * Setter method for property <tt>userPassword</tt>.
     *
     * @param userPassword value to be assigned to property userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * Getter method for property <tt>useEmail</tt>.
     *
     * @return property value of useEmail
     */
    public String getUseEmail() {
        return userEmail;
    }

    /**
     * Setter method for property <tt>useEmail</tt>.
     *
     * @param userEmail value to be assigned to property useEmail
     */
    public void setUseEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    /**
     * Getter method for property <tt>userInfo</tt>.
     *
     * @return property value of userInfo
     */
    public String getUserInfo() {
        return userInfo;
    }

    /**
     * Setter method for property <tt>userInfo</tt>.
     *
     * @param userInfo value to be assigned to property userInfo
     */
    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    /**
     * Getter method for property <tt>headImg</tt>.
     *
     * @return property value of headImg
     */
    public byte[] getHeadImg() {
        return headImg;
    }

    /**
     * Setter method for property <tt>headImg</tt>.
     *
     * @param headImg value to be assigned to property headImg
     */
    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }

    /**
     * Getter method for property <tt>createDate</tt>.
     *
     * @return property value of createDate
     */
    public Date getCreateDate() {
        return createTime;
    }

    /**
     * Setter method for property <tt>createDate</tt>.
     *
     * @param createTime value to be assigned to property createDate
     */
    public void setCreateDate(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "SysUser{" + "id=" + id + ", userName='" + userName + '\'' + ", userPassword='"
               + userPassword + '\'' + ", useEmail='" + userEmail + '\'' + ", userInfo='" + userInfo
               + '\'' + ", headImg=" + Arrays.toString(headImg) + ", createDate=" + createTime
               + '}';
    }
}