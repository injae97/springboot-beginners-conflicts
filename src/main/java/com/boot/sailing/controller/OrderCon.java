package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OrderCon {
	
	@RequestMapping("/order")
	public String doHome() {
		return "/order/order"; 
	}
}