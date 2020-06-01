package suvigya.tutorials.aws.fargate.account_details_service.xrayTracing;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazonaws.xray.javax.servlet.AWSXRayServletFilter;

@Configuration
public class XrayConfig {
	
	  @Bean public Filter tracingFilter() {
		  return new AWSXRayServletFilter("account-details-service-xray");
	  }

}
