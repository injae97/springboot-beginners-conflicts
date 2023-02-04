package com.boot.sailing.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class MenuSvc {
	
	public MenuSvc() {
		log.info("================ MenuSvc , ������ ===================");
	}
	
	public List<Map<String, Object>> doList() {
		// Data Create - List, Map
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();

		map.put("No", "1");
		map.put("name", "���̽��Ƹ�");
		map.put("kind", "Ŀ��");
		map.put("price", "5,000");
		map.put("reg_day", "2020.10.29");
		map.put("mod_day", "2021.10.29");
		list.add(map);

		Map<String, Object> map2 = new HashMap<>();

		map2.put("No", "2");
		map2.put("name", "īǪġ��");
		map2.put("kind", "Ŀ��");
		map2.put("price", "6,000");
		map2.put("reg_day", "2020.10.29");
		map2.put("mod_day", "2021.10.29");
		list.add(map2);
		
		log.info(list);

		return list;
	}
}