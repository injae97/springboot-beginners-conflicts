package com.boot.sailing.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.boot.sailing.service.MenuSvc;

@Controller
public class MenuCon {
	
	// @Autowired�� ���� ���� ����
	@Autowired
	MenuSvc menuSvc;
	
	@GetMapping("/menu")
	public String doMenu(Model model) {

		// List<Map<String, Object>> list = new MenuSvc().doList(); // MenuSvc.java���� ���ο� ��ü�� �����Ͽ� doList �޼ҵ� ȣ�� 
		List<Map<String, Object>> list = menuSvc.doList(); // MenuSvc�� @Service�� Bean�� ����� ���� @Autowired�� ���� ����(Injection) �޾� ���

		model.addAttribute("list", list);
		model.addAttribute("hello", "========== MenuCon ==========");

		return "/menu/menu"; 
	}  
}