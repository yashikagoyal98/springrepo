package com.zensar.services.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // used to mark this class as restful web service class
@RequestMapping("/hello") //URI ( same as path)
public class HelloService 
{
	@GetMapping
	public String sayHello()
	{
		return "Hello from Yashika";
	}
	
}
