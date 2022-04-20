package com.senina.maria.learnspringframework.courses.repository;

import com.senina.maria.learnspringframework.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

// Specify the entity you want to manage & which datatype is the ID field
public interface CourseRepository extends JpaRepository<Course, Long> {
}
