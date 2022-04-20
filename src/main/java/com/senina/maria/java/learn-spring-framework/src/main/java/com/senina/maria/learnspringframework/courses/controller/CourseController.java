package com.senina.maria.learnspringframework.courses.controller;

import com.senina.maria.learnspringframework.courses.bean.Course;
import com.senina.maria.learnspringframework.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @GetMapping("/courses/1")
    public Course getFirstCourse() {
        return getAllCourses().get(0);
    }
}
