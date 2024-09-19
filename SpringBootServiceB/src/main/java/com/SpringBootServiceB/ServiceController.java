/**
 * 
 */
package com.SpringBootServiceB;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author a631954
 *
 */
@RestController
public class ServiceController 
{
	@GetMapping("/service-b")
	public String getServiceB()
	{
		return "Response From Service B";
	}

}
