package com.springtutorial.repository;

import com.springtutorial.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface courseMaterialRepository  extends JpaRepository<CourseMaterial,Long> {
}
