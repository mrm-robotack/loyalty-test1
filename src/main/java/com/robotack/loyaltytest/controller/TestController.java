package com.robotack.loyaltytest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	@GetMapping("")
	public String test()
	{
		System.out.println("Test");
		return "test";
	}
}
