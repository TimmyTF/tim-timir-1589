package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public Greeting root(@RequestParam(value = "name", defaultValue = "ML from root") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/notification")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "ML from notification") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}
}
