/**
 * 
 */
package com.SpringCloudOrderService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author a631954
 *
 */
@RestController
@RequestMapping("/order")
public class OrderRestController 
{
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/info")
	private ResponseEntity<String> showOrderInfo()
	{
		return ResponseEntity.ok("FROM ORDER SERVICE PORT# is : "+port);
	}
}
