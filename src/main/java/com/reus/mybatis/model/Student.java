/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author reus
 * @version $Id: Teacher.java, v 0.1 2018-03-26 reus Exp $
 */
public class Student {

    private Integer       sid;
    private String        name;
    private Integer       age;
    //一个学生有多个老师,一个老师有多个学生
    private List<Teacher> teachers = new ArrayList<Teacher>();

    /**
     * Getter method for property <tt>sid</tt>.
     *
     * @return property value of sid
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * Setter method for property <tt>sid</tt>.
     *
     * @param sid value to be assigned to property sid
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>age</tt>.
     *
     * @return property value of age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Setter method for property <tt>age</tt>.
     *
     * @param age value to be assigned to property age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * Getter method for property <tt>teachers</tt>.
     *
     * @return property value of teachers
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Setter method for property <tt>teachers</tt>.
     *
     * @param teachers value to be assigned to property teachers
     */
    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        return "Student{" + "sid=" + sid + ", name='" + name + '\'' + ", age=" + age + ", teachers="
               + teachers + '}';
    }
}