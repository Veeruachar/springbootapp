package com.Asos.Demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greetings")
public class HomeControleer {
	@GetMapping("/greet/{name}")
	public String home(@PathVariable("name") String name) {
		System.out.println("Hi india");
		System.out.println("Mera bharath mahan");
		return "Captain"+name+" "+"Hello, war deployed";
	}
}
