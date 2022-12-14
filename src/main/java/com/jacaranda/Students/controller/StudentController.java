package com.jacaranda.Students.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jacaranda.Students.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService repositorio;
	
	@GetMapping("listStudent")
	public String listStudent(Model model) {
		model.addAttribute("lista", repositorio.getStudents());
		return "listStudents";
	}
}
