/**
 * 
 */
package com.com.SpringCloudResilence4jCircuitBreaker;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

/**
 * 
 */
@Service
public class SampleService 
{
	private static final String SAMPLE_SERVICE="sampleService";
	
	@CircuitBreaker(name = SAMPLE_SERVICE,fallbackMethod = "fallbackResponse")
	public String callExternalService()
	{
		 if(Math.random() > 0.5)
		 {
			  throw new RuntimeException("Service failed");
		 }
		 return "Service call succeeded";
	}
	
	public String fallBackResponse(Exception ex)
	{
		return "Fallback Response :"+ex.getMessage();
	}
	
	
}
