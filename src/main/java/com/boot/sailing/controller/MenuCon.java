package com.boot.sailing.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuCon {
	
	@GetMapping("/menu")
	public String doMenu(Model model) {
		
		// Data Create - List, Map
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();

	    map.put("No", "1");
	    map.put("name", "아이스아메");
	    map.put("kind", "커피");
	    map.put("price", "5,000");
	    map.put("reg_day", "2020.10.29");
	    map.put("mod_day", "2021.10.29");
	    list.add(map);

		Map<String, Object> map2 = new HashMap<>();

	    map2.put("No", "2");
	    map2.put("name", "카푸치노");
	    map2.put("kind", "커피");
	    map2.put("price", "6,000");
	    map2.put("reg_day", "2020.10.29");
	    map2.put("mod_day", "2021.10.29");
	    list.add(map2);
	    
	    
		// Data 전송 - Model
	    model.addAttribute("list", list);
	    model.addAttribute("hello", "========== MenuCon ==========");
	    
		return "/menu/menu"; 
	}    
}