package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller1 {
	
	@GetMapping("/one")
	public String one() {
		return "one";
	}

}
