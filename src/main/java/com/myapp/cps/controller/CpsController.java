package com.myapp.cps.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.myapp.cps.domain.CpsProductResponse;
import com.myapp.cps.domain.CpsProposalResponse;

@RestController("/v1/cps")
public class CpsController {

	@GetMapping("/product")
	public ResponseEntity<CpsProductResponse> fetchCpsProductResponse(){
		ResponseEntity<CpsProductResponse> productResponse = null;
		return productResponse;
	}
	
	@GetMapping("/proposal")
	public ResponseEntity<CpsProposalResponse> fetchCpsProposalResponse(){
		ResponseEntity<CpsProposalResponse> proposalResponse = null;
		return proposalResponse;
	}
	
}
