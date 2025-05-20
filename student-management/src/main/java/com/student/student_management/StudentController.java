package com.student.student_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController                 // Marks this class as a REST API controller
@RequestMapping("/students")    // Base URL path for all methods here
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    // GET /students  - Get all students
    @GetMapping
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // POST /students  - Add a new student
    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // PUT /students/{id} - Update student by ID
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student updatedStudent) {
        return studentRepository.findById(id)
                .map(student -> {
                    student.setName(updatedStudent.getName());
                    student.setCourse(updatedStudent.getCourse());
                    Student saved = studentRepository.save(student);
                    return ResponseEntity.ok(saved);
                }).orElse(ResponseEntity.notFound().build());
    }




    // DELETE /students/{id} - Delete student by id
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteStudent(@PathVariable int id) {
        if (!studentRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        studentRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}

