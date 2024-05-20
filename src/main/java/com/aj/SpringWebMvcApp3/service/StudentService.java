package com.aj.SpringWebMvcApp3.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.aj.SpringWebMvcApp3.binding.Student;

@Service
public class StudentService {
	
	
	
	public List<String> getCourses(){
		return Arrays.asList("Java","python","aws","devops","webdev");
		
	}
	
	public List<String> getTimings(){
		return Arrays.asList("Morning","Afternnon","evening");
	}
	
	public boolean saveStudent(Student student) {
		return false;
	}

}
