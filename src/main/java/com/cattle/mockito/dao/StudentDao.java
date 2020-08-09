package com.cattle.mockito.dao;

import com.cattle.mockito.domain.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentDao {
    public Student getStudentById(int id){
        return new Student(1916040,10,"周鑫");
    }
//    public Student getStudentScore(int id){
//        return new Student(1916040,10,"周鑫");
//    }
}
