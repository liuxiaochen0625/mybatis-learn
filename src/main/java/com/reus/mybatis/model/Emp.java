/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

/**
 * @author reus
 * @version $Id: Emp.java, v 0.1 2018-03-27 reus Exp $
 */
public class Emp {

    private Integer empno;

    private String  empname;

    /**
     * Getter method for property <tt>empno</tt>.
     *
     * @return property value of empno
     */
    public Integer getEmpno() {
        return empno;
    }

    /**
     * Setter method for property <tt>empno</tt>.
     *
     * @param empno value to be assigned to property empno
     */
    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    /**
     * Getter method for property <tt>empname</tt>.
     *
     * @return property value of empname
     */
    public String getEmpname() {
        return empname;
    }

    /**
     * Setter method for property <tt>empname</tt>.
     *
     * @param empname value to be assigned to property empname
     */
    public void setEmpname(String empname) {
        this.empname = empname;
    }

    @Override
    public String toString() {
        return "Emp{" + "empno=" + empno + ", empname='" + empname + '\'' + '}';
    }
}