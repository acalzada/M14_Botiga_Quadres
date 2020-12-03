package com.M14WhiteCollar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class whiteCollarController {
	
	@GetMapping("/")
	public String saludo() {
		return "Holita vecinito!";
	}
}
