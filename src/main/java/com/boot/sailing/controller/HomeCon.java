package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeCon {

	// URL���� localhost/home�� ������
	@GetMapping("/home")
	public String doHome() {
		return "/home/home"; // template > home > home.html ȭ���� ������
	}
	
	@GetMapping("/rest2")
	@ResponseBody
	public String doRest() {
		String strHtml = "Hi @RestController -> @ResponseBody + @Controller";        
		return strHtml;
	}
}