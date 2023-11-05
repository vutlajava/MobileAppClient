package com.open.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.open.model.Application;
import com.open.model.Data;




@RestController
public class MobileClientController {

	@Autowired
	private WebClient.Builder webClient;
	
	
	@GetMapping("/") 
	public ResponseEntity<Application> getMobileClientDetails() {

		Application application = new Application();;
		
		 RestTemplate restTemplate = new RestTemplate(); 
		
		 
		 
		 /****** below code tested to connect locally and external
		  * http://localhost:8084/v1/x   //local response file
		  * https://requestly.dev/api/mockv2/test.json?teamId=UvssfL5u5jVBBgjcV0CG   //external response file
		  * 
		  * 
		 WebClient.ResponseSpec responseSpec = webClient.build().get()
				    .uri("https://requestly.dev/api/mockv2/test.json?teamId=UvssfL5u5jVBBgjcV0CG")
				    .retrieve();
		 String responseBody = responseSpec.bodyToMono(String.class).block();
		 
		 */
		 
		 WebClient.ResponseSpec responseSpec = webClient.build().get()
				    .uri("https://requestly.dev/api/mockv2/test.json?teamId=UvssfL5u5jVBBgjcV0CG")
				    .retrieve();
		 Application responseBody = responseSpec.bodyToMono(Application.class).block();
		 
		 System.out.println(responseBody.getData().getMobile().get__typename());
		
		return new ResponseEntity<Application>(responseBody,HttpStatus.OK);
		
		
	}
	
}
