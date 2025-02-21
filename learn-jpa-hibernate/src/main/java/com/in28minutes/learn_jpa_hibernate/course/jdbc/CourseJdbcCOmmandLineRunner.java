package com.in28minutes.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCOmmandLineRunner implements CommandLineRunner{
	
	@Autowired
	private CourseJdbcRepository courseJdbcRepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		courseJdbcRepository.insert(new Course(1, "Java", "coursera"));
		courseJdbcRepository.insert(new Course(2, "Java", "udemy"));
//		courseJdbcRepository.deleteById(1);
		Course course = courseJdbcRepository.selectById(1);
		System.out.println(course);
	}
	

}
