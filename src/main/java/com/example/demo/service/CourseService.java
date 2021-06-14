package com.example.demo.service;

import com.example.demo.entity.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CourseService {
 List<Course> getCourses();
 Course getCourse(Long id);
}
