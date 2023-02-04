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
	
	// Data Create - List, Map
	public List<Map<String, Object>> doList() {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();

		map.put("No", "1");
		map.put("name", "���̽��Ƹ޸�ī��");
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
		map2.put("reg_day", "2020.10.30");
		map2.put("mod_day", "2021.10.30");
		list.add(map2);
		
		Map<String, Object> map3 = new HashMap<>();

		map3.put("No", "3");
		map3.put("name", "ī��� �����߶�");
		map3.put("kind", "Ŀ��");
		map3.put("price", "7,000");
		map3.put("reg_day", "2020.10.31");
		map3.put("mod_day", "2021.10.31");
		list.add(map3);
		
		log.info(list);

		return list;
	}
}