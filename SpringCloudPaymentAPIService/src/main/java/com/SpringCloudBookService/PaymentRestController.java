/**
 * 
 */
package com.SpringCloudBookService;

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
@RequestMapping("/payment")
public class PaymentRestController
{
	@Value("${server.port}")
	private String port;
	
	@GetMapping("/info")
	public ResponseEntity<String>showPaymentInfo()
	{
		return ResponseEntity.ok("FROM PAYMENT SERVICE, PORT# is "+port);
	}
}
