package com.example.demo.service;

import com.example.demo.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseServiceImpl
implements CourseService{

    List<Course> list;

    public CourseServiceImpl() {
        list=new ArrayList<>();
        list.add(new Course(1,"a","desc"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }
}
