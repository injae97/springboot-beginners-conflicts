package com.boot.sailing.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.sailing.dao.MenuDao;

import lombok.extern.log4j.Log4j2;

@Service 
@Log4j2
public class MenuSvc {
	
	@Autowired
	MenuDao menuDao;
	
	public MenuSvc() {
		log.info("================ MenuSvc , 생성자 ===================");
	}
	
	public List<Map<String, Object>> doList() {

		List<Map<String, Object>> list = menuDao.doList();
		
		log.info(list);
		return list;	
	}
	
	
	// Data Create - List, Map(Old)
	public List<Map<String, Object>> doListOld() {
		List<Map<String, Object>> list = new ArrayList<>();
		Map<String, Object> map = new HashMap<>();

		map.put("no", "1");
		map.put("coffee", "아이스아메리카노");
		map.put("kind", "커피");
		map.put("price", "5,000");
		map.put("reg_day", "2020.10.29");
		map.put("mod_day", "2021.10.29");
		list.add(map);

		Map<String, Object> map2 = new HashMap<>();

		map2.put("no", "2");
		map2.put("coffee", "카푸치노");
		map2.put("kind", "커피");
		map2.put("price", "6,000");
		map2.put("reg_day", "2020.10.30");
		map2.put("mod_day", "2021.10.30");
		list.add(map2);
		
		Map<String, Object> map3 = new HashMap<>();

		map3.put("no", "3");
		map3.put("coffee", "카라멜 마끼야또");
		map3.put("kind", "커피");
		map3.put("price", "7,000");
		map3.put("reg_day", "2020.10.31");
		map3.put("mod_day", "2021.10.31");
		list.add(map3);
		
		log.info(list);

		return list;
	}
	
	
	
}