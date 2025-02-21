package com.in28minutes.learn_jpa_hibernate.course.springdatajpa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learn_jpa_hibernate.course.jdbc.Course;

@Component
public class CourseSpringDataJPACOmmandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseSpringDataJPARepository courseJpaRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseJpaRepository.save(new Course(1, "Java", "coursera"));
		courseJpaRepository.save(new Course(2, "Java", "udemy"));
		courseJpaRepository.save(new Course(3, "Java17", "udemy"));
//		courseJdbcRepository.deleteById(1);
		Optional<Course> course = courseJpaRepository.findById(1);
		System.out.println(course);
		courseJpaRepository.deleteById(1);
		System.out.println("Author search ++++++ "+courseJpaRepository.findByAuthor("udemy"));
	}
	

}
