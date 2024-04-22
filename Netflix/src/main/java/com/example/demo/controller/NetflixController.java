package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.*;
import com.example.demo.service.NetflixService;
@RestController
public class NetflixController {

	@Autowired
	private NetflixService netflixService;
	
	@PostMapping("/netflix")
	public ResponseEntity<Netflix> saveNetflix(@RequestBody Netflix netflix)
	{ 
		return netflixService.saveNetflix(netflix)	;	
	}
	 
	@GetMapping("/netflix")
	public List<Netflix> getNetflix() 
	{
		return netflixService.getNetflix();
			
	}
	
	
}
