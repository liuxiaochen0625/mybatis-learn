/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

/**
 * @author reus
 * @version $Id: Country.java, v 0.1 2018-03-23 reus Exp $
 */
public class Country {

    private Long   id;

    private String countryname;

    private String countrycode;

    @Override
    public String toString() {
        return "Country{" + "id=" + id + ", countryname='" + countryname + '\'' + ", countrycode='"
               + countrycode + '\'' + '}';
    }

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
     * Getter method for property <tt>countryname</tt>.
     *
     * @return property value of countryname
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * Setter method for property <tt>countryname</tt>.
     *
     * @param countryname value to be assigned to property countryname
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * Getter method for property <tt>countrycode</tt>.
     *
     * @return property value of countrycode
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * Setter method for property <tt>countrycode</tt>.
     *
     * @param countrycode value to be assigned to property countrycode
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}