/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.model;

/**
 * @author reus
 * @version $Id: Person.java, v 0.1 2018-03-26 reus Exp $
 */
public class Person {

    private Long   id;
    private String firstName;
    private String lastName;
    private Person parent;

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
     * Getter method for property <tt>firstName</tt>.
     *
     * @return property value of firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Setter method for property <tt>firstName</tt>.
     *
     * @param firstName value to be assigned to property firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Getter method for property <tt>lastName</tt>.
     *
     * @return property value of lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Setter method for property <tt>lastName</tt>.
     *
     * @param lastName value to be assigned to property lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Getter method for property <tt>parent</tt>.
     *
     * @return property value of parent
     */
    public Person getParent() {
        return parent;
    }

    /**
     * Setter method for property <tt>parent</tt>.
     *
     * @param parent value to be assigned to property parent
     */
    public void setParent(Person parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName='" + firstName + '\'' + ", lastName='"
               + lastName + '\'' + ", parent=" + parent + '}';
    }
}