/**
 * 
 */
package com.com.SpringCloudResilence4jCircuitBreaker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class CircuitBreakerController
{
	private final SampleService sampleService;

	public CircuitBreakerController(SampleService sampleService) 
	{
		super();
		this.sampleService = sampleService;
	}
	@GetMapping("/test")
	public String testCircuitBreaker()
	{
		return sampleService.callExternalService();
	}
	
	
	
}
