package com.student.stu.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.student.stu.Entity.Student;
import com.student.stu.Repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepository;

    
    @Cacheable(value = "students", key = "#id")
    public Student getStudentById(int id) throws InterruptedException {
        System.out.println("Fetching from DB...");
        Thread.sleep(5000);
        return studentRepository.findById(id).orElse(null);
    }
    
    //@CachePut(value = "students", key = "#result.id")
    
    public Student addStudent(Student student) {
        System.out.println("Adding new student to DB and cache...");
        return studentRepository.save(student);
    }

    
    @Cacheable(value = "students")
    public List<Student> getAllStudents() {
        System.out.println("Fetching all students from DATABASE...");
        return studentRepository.findAll();
    }

    @CachePut(value = "students", key = "#student.id")
    public Student updateStudent(Student student) {
        System.out.println("Updating DB and cache...");
        return studentRepository.save(student);
    }

   
    @CacheEvict(value = "students", key = "#id")
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
        System.out.println("Deleted student from DB and cache!");
    }
}
