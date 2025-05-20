package com.student.student_management;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    // We extend JpaRepository to get all basic DB operations for Student entity.
}
