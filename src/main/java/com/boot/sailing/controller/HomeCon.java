package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCon {

	// URL���� localhost/home�� ������
	@GetMapping("/home")
	public String doHome() {
		return "/home/home"; // template > home > home.html ȭ���� ������
	}
}