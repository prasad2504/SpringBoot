package com.student.stu.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.stu.Entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
