package com.mts.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mts.entity.Course;


public interface ICourseRepository extends JpaRepository<Course,Integer> {
	
}
