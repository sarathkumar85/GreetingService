package com.example.greetingservice;

import java.util.Random;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greetings/")
public class GreetingController {

	private static final String[] GREETINGS = { "Hi", "Hello", "W'sup" };

	@RequestMapping(value = "v1/{name}", method = RequestMethod.GET)
	public String greeting(@PathVariable("name") String name) {

		Random rand = new Random();
		int greeting = rand.nextInt(GREETINGS.length);
		
		return GREETINGS[greeting] + ", " + name ;

	}
}
