package com.solution.in.serviceImpl;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.solution.in.Repository.StudentRepository;
import com.solution.in.exception.ResourceNotFoundException;
import com.solution.in.model.Student;
import com.solution.in.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        
    	return studentRepository.findById(id)
    	        .orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(Long id, Student studentDetails) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        student.setAge(studentDetails.getAge());
        student.setCourse(studentDetails.getCourse());
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public Page<Student> getStudentsByPage(Pageable pageable) {
        
        return studentRepository.findAll(pageable);
    }
}
