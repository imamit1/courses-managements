package com.springrest3.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import com.springrest3.springrest.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
