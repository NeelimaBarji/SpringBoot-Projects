package com.in28minutes.learn_jpa_hibernate.course.jpa;

import org.springframework.stereotype.Repository;

import com.in28minutes.learn_jpa_hibernate.course.jdbc.Course;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseJpaRepository {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public void insert(Course course) {
		entityManager.merge(course);
	}
	
	public Course findById(Integer id) {
		return entityManager.find(Course.class, id);
	}
	
	public void deleteById(Integer id) {
		Course course = entityManager.find(Course.class, id);
		entityManager.remove(course);
	}
}
