package com.in28minutes.learn_jpa_hibernate.course.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.learn_jpa_hibernate.course.jdbc.Course;

@Component
public class CourseJpaCOmmandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJpaRepository courseJpaRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseJpaRepository.insert(new Course(1, "Java", "coursera"));
		courseJpaRepository.insert(new Course(2, "Java", "udemy"));
		courseJpaRepository.insert(new Course(3, "Java17", "udemy"));
//		courseJdbcRepository.deleteById(1);
		Course course = courseJpaRepository.findById(1);
		System.out.println(course);
		courseJpaRepository.deleteById(1);
	}
	

}
