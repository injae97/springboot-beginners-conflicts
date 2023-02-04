package com.boot.sailing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberCon {
    
	@RequestMapping("/member")
	public String doHome() {
		return "/member/member"; 
	}
}