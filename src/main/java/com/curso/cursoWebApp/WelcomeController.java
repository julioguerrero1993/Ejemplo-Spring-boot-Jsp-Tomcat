package com.curso.cursoWebApp;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String index(Map<String, Object>model) {
		return "index";
	}
}
