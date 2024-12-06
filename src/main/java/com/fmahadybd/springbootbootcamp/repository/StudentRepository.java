package com.fmahadybd.springbootbootcamp.repository;

import com.fmahadybd.springbootbootcamp.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
