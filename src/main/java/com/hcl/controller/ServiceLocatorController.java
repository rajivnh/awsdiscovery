package com.hcl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.config.ServiceLocationResolver;

@RestController
public class ServiceLocatorController {
    private ServiceLocationResolver serviceLocationResolver;
	
	@GetMapping("/locate")
	public String locate() {
		return serviceLocationResolver.resolve();
	}
}
