package com.aj.SpringWebMvcApp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.aj.SpringWebMvcApp3.binding.Student;
import com.aj.SpringWebMvcApp3.service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String loadIndexPage(Model model) {
		init(model);
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses",service.getCourses());
		model.addAttribute("timing", service.getTimings());
	}
	@PostMapping("/save")
	public String handleSubmitBtn(Student s, Model model) {
		model.addAttribute("msg","Data saved....");
		init(model);
		return "index";
	}
	

}
