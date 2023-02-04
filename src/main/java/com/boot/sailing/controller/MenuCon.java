package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MenuCon {
	
	@RequestMapping("/menu")
	public String doHome() {
		return "/menu/menu"; 
	}
}