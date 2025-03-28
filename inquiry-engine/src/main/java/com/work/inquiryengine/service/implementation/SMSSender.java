package com.work.inquiryengine.service.implementation;

import java.util.concurrent.CompletableFuture;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SMSSender {

	private final RestTemplate restTemplate;
	
    @Autowired
    WebClient webClient;

    protected static final Logger logger = LogManager.getLogger();

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
	

    public void sendSMSNotification() {
        Flux<String> smsNotificationFlux = webClient.get().uri("").retrieve().bodyToFlux(String.class);
        smsNotificationFlux.subscribe(smsNotification -> logger.info(smsNotification.toString()));
    }
}
