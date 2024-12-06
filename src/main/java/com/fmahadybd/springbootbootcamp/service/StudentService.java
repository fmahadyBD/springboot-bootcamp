package com.fmahadybd.springbootbootcamp.service;

import com.fmahadybd.springbootbootcamp.entity.Student;
import com.fmahadybd.springbootbootcamp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    /**
     * - We take it in Constructor Injection. We can take field Injection also by  @Autowired
     */
    private final StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }
}
