package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.soapclient.SoapConnector;

@Configuration
public class AppConfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("com");
		return marshaller;
	}
	
	@Bean
	public SoapConnector soapConnector(Jaxb2Marshaller marshaller) {
		SoapConnector client = new SoapConnector();
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}

}
