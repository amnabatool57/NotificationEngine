package com.work.inquiryengine.service.implementation;

import java.util.concurrent.CompletableFuture;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SMSSender {

	private final RestTemplate restTemplate;

	public SMSSender(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	@Async("asyncSMSTaskExecutor")
	public CompletableFuture<String> sendSMS(int i) throws InterruptedException {
		System.out.println("Sending SMS -> " + i);
		String url = "https://api.ipify.org".formatted();
		String results = restTemplate.getForObject(url, String.class);
		// Artificial delay of 1s for demonstration purposes
		Thread.sleep(1L + (long) (Math.random() * (10L - 1L)));
		System.out.println("SMS Sent-> " + i + " " + results);
		return CompletableFuture.completedFuture(results);
	}
}
