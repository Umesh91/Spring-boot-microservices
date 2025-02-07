/**
 * 
 */
package com.SpringCloudPaymentService.consumer;

import java.net.URI;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;



/**
 * @author a631954
 *
 */
@Component
public class CartRestConsumer 
{
	@Autowired
	private org.springframework.cloud.client.discovery.DiscoveryClient client;
	
	public String getCartInfo()
	{
	   String response="";	
	   try 
	   {
		  // get ServiceInstance list using serviceId
		   List<ServiceInstance> sList=client.getInstances("CART-SERVICE");  
		 // read manually one instance from index#0 
		   ServiceInstance si = sList.get(0);
		// read URI and Add path that returns url
		   String url=si.getUri()+"/cart/getData";
		   System.out.println("URL of Cart::"+url);
		 // create object for RestTemplate
	       RestTemplate rt = new RestTemplate();
	     // make HTTP call and get Reponse data
	       response = rt.getForObject(url, String.class);
	       System.out.println("response from CART-SERVICE"+response);
	   }
	    catch(IndexOutOfBoundsException e)
	    {
	    	System.out.println("Index out of bounds Exception::::"+e.getStackTrace());
	    }
	   // return response back to Consumer 
       return response; 
	}

}
