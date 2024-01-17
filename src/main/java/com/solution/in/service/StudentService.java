package com.solution.in.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.solution.in.model.Student;

public interface StudentService {

    List<Student> getAllStudents();

    Student getStudentById(Long id);

    Student createStudent(Student student);

    Student updateStudent(Long id, Student studentDetails);

    void deleteStudent(Long id);

    Page<Student> getStudentsByPage(Pageable pageable);
}
