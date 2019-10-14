package com.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.Response;

@RestController
@RequestMapping(value="track" , produces= MediaType.APPLICATION_JSON_VALUE)
public class TrackedDataController {
	
	/*@RequestMapping( value="test", method = RequestMethod.GET)
	public ResponseEntity<Response<String>> getTest(){
		
		return new ResponseEntity<>(
				new Response<>( HttpStatus.OK.value(),
				"It's working fine.",
				"200"), HttpStatus.OK);
	}*/
}