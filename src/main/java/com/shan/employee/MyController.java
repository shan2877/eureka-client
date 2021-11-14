package com.shan.employee;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
@RefreshScope
public class MyController {

	
	@PostMapping
	@ResponseBody
	public ResponseEntity<Object> getAllEmployess(@RequestHeader("my-header") String header)
	{
	
		return new ResponseEntity<Object>(Arrays.asList("Shan","Sundar", "Kavish",header), HttpStatus.OK);
	}
	
	@RequestMapping("/test")
	@GetMapping
	public Mono<ResponseEntity> getTestData()
	{
		
		ResponseEntity<String> responseEntity = ResponseEntity.status(201).body("Hello");
		return Mono.just(responseEntity);
	}
}
