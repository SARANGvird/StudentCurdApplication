package com.solution.in.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.solution.in.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    // Any custom queries or methods can be added here if needed

    // Custom query to find students by a specific course
    List<Student> findByCourse(String course);

    // Custom query to find students with an age greater than a specified value
    List<Student> findByAgeGreaterThan(int age);

    // Custom query with pagination to find students by a specific course
    Page<Student> findByCourse(String course, Pageable pageable);

    // Custom JPQL query to find students with a custom query
    @Query("SELECT s FROM Student s WHERE s.name LIKE %:keyword%")
    List<Student> searchStudentsByNameKeyword(String keyword);
}
