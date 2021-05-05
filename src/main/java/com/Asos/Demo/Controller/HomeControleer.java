package com.Asos.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HomeControleer {
	@GetMapping("/greet")
	public String home() {
		return "Hello, war deployed";
	}
}
