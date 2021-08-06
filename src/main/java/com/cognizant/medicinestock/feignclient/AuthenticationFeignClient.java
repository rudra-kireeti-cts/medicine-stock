package com.cognizant.medicinestock.feignclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.medicinestock.model.JwtResponse;


public interface AuthenticationFeignClient {


	@GetMapping(path = "/api/auth/validate")
	public JwtResponse verifyToken(@RequestHeader(name = "Authorization", required = true) String token);

}
