package com.springtutorial.repository;

import com.springtutorial.entity.Course;
import com.springtutorial.entity.CourseMaterial;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class courseMaterialRepositoryTest {
    @Autowired
    private courseMaterialRepository repository;

    @Test
    public void saveCourseMaterial(){
        Course course=Course.builder()
                .title("DsA")
                .credit(6)
                .build();

        CourseMaterial courseMaterial=CourseMaterial.builder()
                .course(course)
                .url("hello.www")
                .build();
      repository.save(courseMaterial);
    }

    @Test
    public void fetchCourseMaterial(){

        List<CourseMaterial> courseMaterials= repository.findAll();
        System.out.println(courseMaterials);
    }

}