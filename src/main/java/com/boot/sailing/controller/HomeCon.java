package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeCon {

	// URL���� localhost �Ǵ� localhost/home�� ������
	@RequestMapping({"/", "/home"})
	public String doHome() {
		return "/home/home"; // template > home > home.html ȭ���� ������
	}
}