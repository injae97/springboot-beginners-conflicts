package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCon {

	// URL에서 localhost/home로 들어오면
	@GetMapping("/home")
	public String doHome() {
		return "/home/home"; // template > home > home.html 화면을 보여줌
	}
}