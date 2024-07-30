package com.example.BootTest.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.BootTest.mapper.T1Mapper;

@Controller
public class T1Controller {

	@Autowired
	private T1Mapper t1;
	
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("list", t1.findAll());
		model.addAttribute("img", "image/idk.jpg");
		model.addAttribute("img2", "image/uds.jpg");
		return "home";
	}
	@GetMapping("/input")
	public String input() {
		t1.input();
		return "redirect:/";
	}
	
	
	
	
	
}
