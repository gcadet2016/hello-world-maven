package com.muk;

import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class HelloWorldController {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String getHello() {
		
		return "This is sample Hello World Update to test jenkins";
		
	}
	
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> greeting(){
		
        return ResponseEntity.ok("Greeting! Welcome to Spring-Boot Development!");
     }
	
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> test(){
		
        return ResponseEntity.ok("This test() method hasn't unit test cases changed now to test rediness probe!");
     }
	
	@RequestMapping(value = "/healthz", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<?> healthz(){
		
        return ResponseEntity.ok("I am still a live!");
     }
}
