package com.springtutorial.repository;

import com.springtutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student=Student.builder()
                .emailId("stu@gmail.com")
                .firstName("Murali")
                .lastName("Krishna")
                .guardianName("MuraliKrishna")
                .guardianEmail("guardian@gmail.com")
                .guardianMobile("0978654321")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printStudent(){
        List<Student> studentList=studentRepository.findAll();
        System.out.println(studentList);

    }


}