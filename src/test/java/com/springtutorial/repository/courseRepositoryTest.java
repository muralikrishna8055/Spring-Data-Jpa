package com.springtutorial.repository;

import com.springtutorial.entity.Course;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class courseRepositoryTest {
    @Autowired
    private courseRepository courseRepository;

    @Test
    public void printAllCourses(){

        List<Course> course=courseRepository.findAll();
        System.out.println(course);
    }

}