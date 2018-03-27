/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author reus
 * @version $Id: Student.java, v 0.1 2018-03-26 reus Exp $
 */
public class Teacher {

    private Integer       tid;
    private String        tname;
    private String        subject;
    //一个学生有多个老师,一个老师有多个学生
    private List<Student> students = new ArrayList<Student>();

    /**
     * Getter method for property <tt>tid</tt>.
     *
     * @return property value of tid
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * Setter method for property <tt>tid</tt>.
     *
     * @param tid value to be assigned to property tid
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * Getter method for property <tt>tname</tt>.
     *
     * @return property value of tname
     */
    public String getTname() {
        return tname;
    }

    /**
     * Setter method for property <tt>tname</tt>.
     *
     * @param tname value to be assigned to property tname
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * Getter method for property <tt>subject</tt>.
     *
     * @return property value of subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Setter method for property <tt>subject</tt>.
     *
     * @param subject value to be assigned to property subject
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Getter method for property <tt>students</tt>.
     *
     * @return property value of students
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Setter method for property <tt>students</tt>.
     *
     * @param students value to be assigned to property students
     */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Teacher{" + "tid=" + tid + ", tname='" + tname + '\'' + ", subject='" + subject
               + '\'' + ", students=" + students + '}';
    }
}