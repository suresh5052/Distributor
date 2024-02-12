package com.example.taskproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.taskproject.entity.Distributor;
import com.example.taskproject.service.DistributorService;


@RestController
@RequestMapping("/api/dstr")
public class DistributorController {

	@Autowired
	DistributorService distributorService;

	
	@PostMapping("/savedistributor")
	public ResponseEntity<?> saveDistributor(@RequestBody Distributor distibutor) {
		
		return new ResponseEntity<>(distributorService.saveDistributor(distibutor), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllDistributors")
	public List<Distributor> getAllDistributors(){
		
		return distributorService.getAllDistributors();
		
	}}
//	@PostMapping("/savedistributor")
//	public ResponseEntity<?> saveDistributor(DistributorDto distributorDto){
//		return new ResponseEntity<>(distributorService.saveDistributor(distributorDto), HttpStatus.CREATED);
//		
//	}
//}
