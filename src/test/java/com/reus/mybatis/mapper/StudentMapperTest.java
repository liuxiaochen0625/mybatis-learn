package com.reus.mybatis.mapper;

import com.reus.mybatis.model.Student;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author reus
 * @version $Id: StudentMapperTest.java, v 0.1 2018-03-26 reus Exp $
 */
public class StudentMapperTest extends BaseMapperTest {
    @Test
    public void select_student_teacher() throws Exception {
        SqlSession sqlSession = getSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student student = studentMapper.select_student_teacher(1);
            System.out.println(student.getName());
            System.out.println(student.getTeachers());
        } finally {
            sqlSession.close();
        }

    }

    @Test
    public void selectStudentLazy() throws Exception {
        SqlSession sqlSession = getSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student student = studentMapper.selectStudentLazy(1);
            System.out.println(student.getName());
            System.out.println(student.getTeachers());
        }finally {
            sqlSession.close();
        }
    }

}