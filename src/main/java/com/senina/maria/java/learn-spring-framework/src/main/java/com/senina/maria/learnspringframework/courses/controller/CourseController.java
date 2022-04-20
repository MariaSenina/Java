package com.senina.maria.learnspringframework.courses.controller;

import com.senina.maria.learnspringframework.courses.bean.Course;
import com.senina.maria.learnspringframework.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping("/courses/{id}")
    public Course getFirstCourse(@PathVariable long id) {
        Optional<Course> course = courseRepository.findById(id);
        if(course.isEmpty()) {
            throw new RuntimeException("Course not found " + id);
        }

        return course.get();
    }
}
