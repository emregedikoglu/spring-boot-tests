package com.sebit.test.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sebit.test.service.TestService;

@RestController
public class TestCtrl {
	@Autowired
	private TestService testService;
	
	@RequestMapping
	public String welcomeMessage() {
		return testService.welcomeMessage();
	}
	
	@RequestMapping(value = "/message")
	public String getMessage() {
		return testService.getMessage();		
	}
	
	@RequestMapping(value = "/message2")
	public String getMessage2(@RequestParam(value = "msg") String msg) {
		return testService.getMessage2(msg);		
	}
	
	@RequestMapping(value = "/message3")
	public String getMessage3(	@RequestParam(value = "msg1") String msg1,
								@RequestParam(value = "msg2") String msg2) {
		return testService.getMessage3(msg1, msg2);		
	}
	
}
