package com.senina.maria.learnspringframework.courses.controller;

import com.senina.maria.learnspringframework.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"),
                new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
    }

    @GetMapping("/courses/1")
    public Course getFirstCourse() {
        return getAllCourses().get(0);
    }
}
