package com.work.inquiryengine.configuration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.ExchangeFilterFunction;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Configuration
public class WebClientConfiguration {

	protected static final Logger logger = LogManager.getLogger();

	@Bean
	public WebClient webClient() {

		// Create a WebClient bean for making reactive web requests
		WebClient webClient = WebClient.builder().baseUrl("https://api.ipify.org") // Set the base URL for the requests
				.defaultCookie("cookie-name", "cookie-value") // Set a default cookie for the requests
				.defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE) // Set a default header for
																							// the requests
				.filters(exchangeFilterFunctions -> {
					exchangeFilterFunctions.add(logRequest());
					exchangeFilterFunctions.add(logResponse());
				}).build();

		return webClient; // Return the configured WebClient bean
	}

	ExchangeFilterFunction logRequest() {
		return ExchangeFilterFunction.ofRequestProcessor(clientRequest -> {
			if (logger.isDebugEnabled()) {
				StringBuilder sb = new StringBuilder("Request: \n");
				// append clientRequest method and url
				clientRequest.headers()
						.forEach((name, values) -> values.forEach(value -> logger.info("{}={}", name, value)));
				logger.debug(sb.toString());
			}
			return Mono.just(clientRequest);
		});
	}

	ExchangeFilterFunction logResponse() {
		return ExchangeFilterFunction.ofResponseProcessor(clientResponse -> {
			if (logger.isDebugEnabled()) {
				logger.info("Response Status Code: {}", clientResponse.statusCode());
				clientResponse.headers().asHttpHeaders()
						.forEach((name, values) -> values.forEach(value -> logger.info("{}: {}", name, value)));
				logger.debug(clientResponse.bodyToMono(String.class));
			}
			return Mono.just(clientResponse);
		});
	}
}