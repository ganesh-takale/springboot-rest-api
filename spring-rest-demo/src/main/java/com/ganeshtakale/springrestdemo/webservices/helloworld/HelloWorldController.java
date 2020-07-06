package com.ganeshtakale.springrestdemo.webservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("hello-world")
	public String helloworld(){
		return "Hello World";
	}

	@GetMapping("hello-world-bean")
	public HelloWorldBean helloworldBean(){
		return new HelloWorldBean("Hello World");
	}

	@GetMapping("hello-world-bean/{name}")
	public HelloWorldBean helloworldPathVariable(@PathVariable String name){
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
}
