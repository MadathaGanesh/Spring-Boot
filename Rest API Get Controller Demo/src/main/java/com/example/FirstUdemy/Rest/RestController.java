package com.example.FirstUdemy.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	
	
	// Accessing values from Application.properties using @Value() annotation
	@Value("${team.name}")
	private String teamName;
	
	@Value("${players.captain}")
	private String teamCaptain;
	
	
	@GetMapping("/teamDetails")
	public String teamDetails() {
		return "Team captain is :"+ teamCaptain +".  Team Name is: " +teamName;
	}
	
	@GetMapping("/")
	public String message() {
		return "I am Bhairava!";
	}
	
	@GetMapping("/Bujji")
	public String Bujji() {
		return "I am Bujji!";
	}
	
	@GetMapping("/comedy")
	public String comedy() {
		return "I am from comedyyy";
	}
	
	@GetMapping("/call")
	public int number() {
		return 1223;
	}
	

}
