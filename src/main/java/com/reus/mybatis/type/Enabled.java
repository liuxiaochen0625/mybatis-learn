/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.type;

/**
 * @author reus
 * @version $Id: Enabled.java, v 0.1 2018-03-26 reus Exp $
 */
public enum Enabled {

                     disabled(1), //禁用

                     enabled(0);//启用

    private final int value;

    private Enabled(int value) {
        this.value = value;
    }

    /**
     * Getter method for property <tt>value</tt>.
     *
     * @return property value of value
     */
    public int getValue() {
        return value;
    }
}