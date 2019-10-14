package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.GetStudentDetailsRequest;
import com.ObjectFactory;
import com.soapclient.SoapConnector;

@RestController
@RequestMapping("test-soap")
public class TestSoapClient {

	SoapConnector soap = new SoapConnector();
	
	@GetMapping("data")
	public String getData() {
		ObjectFactory ob = new ObjectFactory();
		
		GetStudentDetailsRequest studentDetailsRequest = ob.createGetStudentDetailsRequest();
		studentDetailsRequest.setId(0);
		String url = "http://localhost:8084/soap-api/ws/students.wsdl";
		Object o = soap.soapConnect(url, studentDetailsRequest);
		Gson g = new Gson();
		System.out.println(g.toJson(o));
		return null;
	}
}
