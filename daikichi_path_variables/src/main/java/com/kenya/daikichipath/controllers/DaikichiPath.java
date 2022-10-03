package com.kenya.daikichipath.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikichiPath {
	
	// ==== PATH VARIABLES ======
	// curly braces to create a variable 
	@RequestMapping("/daikichi/travel/{city}")
	public String home(@PathVariable("city") String city ) {
		return "Congrats! You will soon travel to " + city;
	}
	
	@RequestMapping("/daikichi/lotto/{num}")
	public String lotto(@PathVariable("num") Integer num ) {
		if (num %2 == 0 ) {
			//if num is even return this 
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
			// if num is odd
			return "You have enjoyed the fruits of your labor but now is a great time to spen time with family and firends.";
	}

	
}
