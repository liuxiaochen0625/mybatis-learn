/**
 * Weidai
 * Copyright (C), 2011 - 2018, 微贷网.
 */
package com.reus.mybatis.mapper;

import com.reus.mybatis.model.Student;

/**
 * @author reus
 * @version $Id: StudentMapper.java, v 0.1 2018-03-26 reus Exp $
 */
public interface StudentMapper {

    Student select_student_teacher(int sid);

    Student selectStudentLazy(int sid);

}