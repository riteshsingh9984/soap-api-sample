package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author RITESH SINGH
 * @since JDK 1.8
 * @version 1.0
 *
 */

@SpringBootApplication 
public class Application extends SpringBootServletInitializer{
  public static void main(String[] args) {
	//System.setProperty("spring.devtools.restart.enabled", "false");
    SpringApplication.run(Application.class, args);
  }
  

}
