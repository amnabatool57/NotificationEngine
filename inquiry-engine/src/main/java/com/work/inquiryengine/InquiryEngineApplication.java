package com.work.inquiryengine;

import java.time.LocalTime;
import java.util.concurrent.Executor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import com.work.inquiryengine.service.implementation.EmailServiceImpl;
import com.work.inquiryengine.service.implementation.SMSSender;

@SpringBootApplication
@EnableAutoConfiguration
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableCaching
@EnableAsync
@EnableJpaRepositories
public class InquiryEngineApplication {

	@Autowired
	public RedisTemplate<String, String> redisTemplate;

	@Autowired
	public EmailServiceImpl emailServiceImpl;

	@Autowired
	public SMSSender smsSender;

	protected static final Logger logger = LogManager.getLogger();

	public static void main(String[] args) {
		SpringApplication.run(InquiryEngineApplication.class, args);
		logger.info("Inquiry Engine Started");
		logger.info("Info level log message");
		logger.debug("Debug level log message");
		logger.error("Error level log message");
	}

	@Scheduled(fixedRate = 50000)
	protected void scheduleWithFixedRate() {
		logger.info("Scheduling at fixedRate : " + LocalTime.now());
//		emailServiceImpl.sendSimpleMessage("hamza.siddiqui@techlogix.com", "Test Spring", "Test Spring Message");
	}

	@Scheduled(cron = "0 * * * * ?")
	protected void scheduleWithCron() {
		logger.info("Cron Job is running at : " + LocalTime.now());
		redisTemplate.opsForValue().set("message", "Hello Redis!");
		logger.info(redisTemplate.opsForValue().get("message"));
	}

	// @Scheduled(cron = "0 * * * * ?")
	public void run() throws Exception {
		// Start the clock
		int i = 500;
		while (i > 0) {
			smsSender.sendSMS(i);
			i--;
		}
	}

	@Bean(name = "asyncSMSTaskExecutor")
	Executor taskExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(50);
		executor.setMaxPoolSize(100);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("asyncSMSTaskExecutor-");
		executor.initialize();
		return executor;
	}

}
