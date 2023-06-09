package com.springrest3.springrest.services;

import java.util.List;

import com.springrest3.springrest.entities.Course;

public interface CourseService {
	
	
	public List<Course> getCourses();
	
	public Course getCourse(Long courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public void deleteCourse(Long courseId);
	
		


}
