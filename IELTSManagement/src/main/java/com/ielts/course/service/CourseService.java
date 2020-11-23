package com.ielts.course.service;

import com.ielts.course.model.Course;
import com.ielts.course.repository.CourseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository repository;

    @Transactional
    public Course saveOrUpdate(Course course){
        return repository.save(course);
    }

    @Transactional
    public boolean delete(Course course){
        repository.delete(course);
        return true;
    }

    @Transactional
    public List<Course> findAll(){
       return repository.findAll();
    }

    @Transactional
    public List<Course> findByName(String name){
        return repository.findByName(name);
    }

    @Transactional
    public List<Course> findByDuration(String duration){
        return repository.findByDuration(duration);
    }

    @Transactional
    public Course findById(long id){
        return repository.findById(id).orElse(new Course());
    }

}
