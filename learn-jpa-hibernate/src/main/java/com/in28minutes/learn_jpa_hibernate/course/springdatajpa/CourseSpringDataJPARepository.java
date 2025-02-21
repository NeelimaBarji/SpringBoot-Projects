package com.in28minutes.learn_jpa_hibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.learn_jpa_hibernate.course.jdbc.Course;


public interface CourseSpringDataJPARepository extends JpaRepository<Course, Integer>{
	
	List<Course> findByAuthor(String author);
}
