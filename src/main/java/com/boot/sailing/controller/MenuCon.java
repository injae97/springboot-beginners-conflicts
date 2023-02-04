package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCon {
	
	@GetMapping("/menu")
	public String doHome() {
		return "/menu/menu"; 
	}
}