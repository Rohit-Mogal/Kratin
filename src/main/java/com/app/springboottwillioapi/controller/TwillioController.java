package com.app.springboottwillioapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.springboottwillioapi.service.TwillioService;

@RestController
public class TwillioController {

	
	
	@Autowired
	TwillioService twillioService;
	
	@Value("${app.twillio.fromPhoneNo}")
	private String from;
	
	@Value("${app.twillio.toPhoneNo}")
	private String to;

	@GetMapping("/sendSms")
	public String sendSms() {
		
		String body = "Time for medicines!";
		twillioService.sendSms(to, from, body);
		return "message sent successfully";
		
		
	}
	
	
	

	
	
	
	
	

}
