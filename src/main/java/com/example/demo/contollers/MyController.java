package com.example.demo.contollers;


import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import com.example.demo.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class MyController {
    @Autowired
    private CourseService service_;
    @Autowired
    private Course course;

    @GetMapping("/home")
    public String home() {
        System.out.println("this is home");
        return "This is home";
    }

    public MyController() {
        service_ = new CourseServiceImpl();
    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.service_.getCourses();
    }

    @GetMapping("/course/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.service_.getCourse(Long.parseLong(courseId));
    }
    @PostMapping(path = "/courses")
    public Course addCourse(@RequestBody  Course course){
        // course=new Course(2,"two","desc_2");
        return this.service_.addCourse(course);
    }
    @PutMapping(path = "/courses")
    public Course updateCourse(@RequestBody Course course)
    {
        return this.service_.updateCourse(course);
    }

    @DeleteMapping(path = "/course/{courseId}")
    public Course deleteCourse(@PathVariable String courseId){
        return this.service_.deleteCourse(Long.parseLong(courseId));
    }


}
