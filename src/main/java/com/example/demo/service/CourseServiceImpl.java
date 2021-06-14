package com.example.demo.service;

import com.example.demo.entity.Course;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl
        implements CourseService {

    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(1, "a", "desc"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(Long id) {
        Course var = null;
        for (Course course : list) {
            if (id == course.getId()) {
                var = course;
                break;

            }
        }

        return var;
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {

        for (Course c1 : list) {
            if ( course.getId()== c1.getId()) {
                list.remove(c1);
                list.add(course);
                break;

            }
        }



        return course;
    }

    @Override
    public Course deleteCourse(Long id) {
        Course var = null;
        for (Course course : list) {
            if (id == course.getId()) {
                var = course;
                break;

            }
        }
        list.remove(var);
        return null;
    }


}
