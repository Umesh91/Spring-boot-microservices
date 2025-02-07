/**
 * 
 */
package com.SpringCloudGatewayService;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author a631954
 *
 */
@Configuration
public class SpringCloudGatewayRouting
{
	@Bean
	public RouteLocator configureRoute(RouteLocatorBuilder builder)
	{
		return builder.routes().route("paymentId", r->r.path("/payment/**").uri("http://localhost:9005"))
				.route("orderId", r->r.path("/order/**").uri("lb://ORDER-SERVICE"))
				.build();
	}
}
