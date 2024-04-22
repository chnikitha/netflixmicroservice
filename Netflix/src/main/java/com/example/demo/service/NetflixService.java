package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.entity.*;
import com.example.demo.repo.NetflixRepo;
import java.util.*;
@Service
public class NetflixService {

	@Autowired
	NetflixRepo netflixRepo;
	public ResponseEntity<Netflix> saveNetflix(@RequestBody Netflix netflix)
	{ 
		return new ResponseEntity<>(netflixRepo.save(netflix),HttpStatus.CREATED);		
	}
	
	
	public List<Netflix> getNetflix() {
		// TODO Auto-generated method stub
		 return netflixRepo.findAll();
		
	}
	
}
