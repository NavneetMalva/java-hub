package com.springboot.learnspringboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@GetMapping("/course")
	public List<Course> retriveCourse() {
		return Arrays.asList(
				new Course(1, "Learn AKS", "Rick"), 
				new Course(2, "Learn devOps", "Morty")
				);

	}
	
	List<Course> coursesList = new ArrayList<>();
	
	@PostMapping("/add/courses")
	public Course addCourses(@RequestBody Course course){
		coursesList.add(course);
		return course;
	}
	
	@GetMapping("/courses")
	public List<Course> retriveAllCourses(){
		return coursesList;
	}
	

}
