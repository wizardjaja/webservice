package com.wizard.resources.impl;

import com.wizard.entity.Student;
import com.wizard.resources.StudentService;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImpl implements StudentService {
    @Override
    public Student getStudentById(Integer id) {
        return new Student(id, "wizard", 'M', "", 27);
    }
}
