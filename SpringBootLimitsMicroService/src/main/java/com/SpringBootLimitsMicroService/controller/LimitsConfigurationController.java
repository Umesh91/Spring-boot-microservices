/**
 * 
 */
package com.SpringBootLimitsMicroService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootLimitsMicroService.bean.LimitConfiguration;

/**
 * 
 */
@RestController
public class LimitsConfigurationController 
{
	@GetMapping("/limits")
	public LimitConfiguration retriveLimitsFromConfigurations()
	{
		return new LimitConfiguration(1000, 1);
	}
	
}
