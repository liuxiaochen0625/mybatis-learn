/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author reus
 * @version $Id: Dept.java, v 0.1 2018-03-27 reus Exp $
 */
public class Dept {

    private Integer  deptno;

    private String   deptname;

    private Set<Emp> emp = new HashSet<>();

    /**
     * Getter method for property <tt>deptno</tt>.
     *
     * @return property value of deptno
     */
    public Integer getDeptno() {
        return deptno;
    }

    /**
     * Setter method for property <tt>deptno</tt>.
     *
     * @param deptno value to be assigned to property deptno
     */
    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    /**
     * Getter method for property <tt>deptname</tt>.
     *
     * @return property value of deptname
     */
    public String getDeptname() {
        return deptname;
    }

    /**
     * Setter method for property <tt>deptname</tt>.
     *
     * @param deptname value to be assigned to property deptname
     */
    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    /**
     * Getter method for property <tt>emp</tt>.
     *
     * @return property value of emp
     */
    public Set<Emp> getEmp() {
        return emp;
    }

    /**
     * Setter method for property <tt>emp</tt>.
     *
     * @param emp value to be assigned to property emp
     */
    public void setEmp(Set<Emp> emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Dept{" + "deptno=" + deptno + ", deptname='" + deptname + '\'' + ", emp=" + emp
               + '}';
    }
}