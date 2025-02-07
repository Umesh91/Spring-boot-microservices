/**
 * 
 */
package com.SpringCloudPaymentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringCloudPaymentService.consumer.CartRestConsumer;

/**
 * @author a631954
 *
 */
@RestController
@RequestMapping("/payment")
public class PaymentRestController 
{
	@Autowired
	private CartRestConsumer consumer;
	
	@GetMapping("/getPayment")
	public String getPaymentData()
	{
		return "FROM PAYMENT-SERVICE : " + consumer.getCartInfo();
	}
	
	
	
	
}
