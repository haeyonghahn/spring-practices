package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@ResponseBody // 화면 그대로 출력하게 된다.
	@RequestMapping({"/", "/main"})
	public String main() {
		return "MainController:main";
	}
}

