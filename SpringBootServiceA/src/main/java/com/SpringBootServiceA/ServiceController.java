/**
 * 
 */
package com.SpringBootServiceA;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author a631954
 *
 */
@RestController
public class ServiceController {

	@GetMapping("/service-a")
	public String getServiceA()
	{
		return "Response From Service A";
	}
	
	
}
