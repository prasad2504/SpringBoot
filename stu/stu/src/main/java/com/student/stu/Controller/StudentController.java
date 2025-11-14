package com.student.stu.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.stu.Entity.Student;
import com.student.stu.Service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id) throws InterruptedException {
        return studentService.getStudentById(id);
    }

    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    
    
   
    public List<Student> getAllStudents() {
        System.out.println("Fetching data from database...");
        return studentService.getAllStudents();
    }
    
    @PutMapping("/up")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "Student deleted successfully!";
    }
}

