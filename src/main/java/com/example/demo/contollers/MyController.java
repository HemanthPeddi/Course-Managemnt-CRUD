package com.example.demo.contollers;


import com.example.demo.entity.Course;
import com.example.demo.service.CourseService;
import com.example.demo.service.CourseServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class MyController {
    CourseService service_;
    @GetMapping("/home")
    public String home(){
        System.out.println("this is home");
        return "This is home";
    }

    public MyController() {
        service_ = new CourseServiceImpl();
    }

    @GetMapping("/courses")
    public  List<Course> getCourses(){

return service_.getCourses();
    }
}
