package com.ielts.course.repository;

import com.ielts.course.model.Course;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByName(String name);
    List<Course> findByDuration(String duration);
}
