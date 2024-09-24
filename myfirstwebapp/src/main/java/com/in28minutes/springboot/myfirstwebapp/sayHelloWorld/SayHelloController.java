package com.in28minutes.springboot.myfirstwebapp.sayHelloWorld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	//http://localhost:8080/say-hello
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayhello() {
		return "Hello World";
	}
	
	@RequestMapping("say-hello-jsp")
	
	public String sayHelloJsp() {
		return "sayHello";
	}
}
