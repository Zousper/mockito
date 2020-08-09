package com.cattle.mockito.service;

import com.cattle.mockito.dao.StudentDao;
import com.cattle.mockito.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class StudentService{

    @Autowired
    StudentDao studentDao;

    public Student getStudentById(int id){
        return studentDao.getStudentById(id);
    }
    public int add(int a, int b){
        return a+b;
    }


}
