package com.cattle.mockito.service;

import com.cattle.mockito.dao.StudentDao;
import com.cattle.mockito.domain.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;
import sun.reflect.generics.tree.VoidDescriptor;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
 class StudentServiceTest {
    @Autowired
    StudentService studentService;
    @MockBean
    StudentDao studentDao;

    @BeforeEach
    void setUp() {
        Mockito.when(studentDao.getStudentById(1916040)).thenReturn(new Student(1916040,22,"周大侠"));
    }

    @Test
    void getStudentById() {
        Student student = studentService.getStudentById(1916040);
        assertNotNull(student);
        assertEquals(student.getName(),"周大侠");
        assertEquals(student.getAge(),22);
    }
    @Test
    public void  addTest(){
        assertEquals(9,new StudentService().add(3,6));
    }

}
