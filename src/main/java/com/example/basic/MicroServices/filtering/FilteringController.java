package com.example.basic.MicroServices.filtering;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController 
{
	@GetMapping("/filtering")
public SomeBeans  retrieveSomeBeans()
{
	
		
	return new SomeBeans("drake","7","v");
}
}
