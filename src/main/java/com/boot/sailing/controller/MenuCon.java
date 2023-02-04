package com.boot.sailing.controller;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.sailing.service.MenuSvc;

@Controller
public class MenuCon {
	
	@GetMapping("/menu")
	public String doMenu(Model model) {

		List<Map<String, Object>> list = new MenuSvc().doList(); // MenuSvc.java���� doList �޼ҵ� ȣ�� 

		// Data ���� - Model
		model.addAttribute("list", list);
		model.addAttribute("hello", "========== MenuCon ==========");

		return "/menu/menu"; 
	}  
}