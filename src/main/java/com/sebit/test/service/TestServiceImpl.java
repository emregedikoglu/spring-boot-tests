package com.sebit.test.service;

import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Merhaba Ege";
	}

	@Override
	public String getMessage2(String message) {
		// TODO Auto-generated method stub
		return "Merhaba " + message;
	}

	@Override
	public String getMessage3(String message1, String message2) {
		// TODO Auto-generated method stub
		return "Merhaba " + message1 + " " + message2;
	}

	@Override
	public String welcomeMessage() {
		// TODO Auto-generated method stub
		return "Hosgeldin";
	}

}
