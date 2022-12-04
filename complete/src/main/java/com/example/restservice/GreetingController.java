package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	private static final Log logger = LogFactory.getLog(GreetingController.class);

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/")
	public Greeting root(@RequestParam(value = "name", defaultValue = "ML from root") String name) {
		logger.info("root() has been called");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/notification")
	public Greeting notification(@RequestParam(value = "name", defaultValue = "ML from notification") String name) {
		logger.info("notification() has been called");
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@PostMapping("/dummyPost")
	public Greeting dummyPost() {
		logger.info("dummyPost() has been called");
		return new Greeting(counter.incrementAndGet(), "Hello from dummyPost");
	}
}
