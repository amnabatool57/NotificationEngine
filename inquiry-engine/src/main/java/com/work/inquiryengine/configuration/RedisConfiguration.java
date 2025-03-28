package com.work.inquiryengine.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericToStringSerializer;

@Configuration
//@EnableRedisRepositories(basePackages = "com.baeldung.spring.data.redis.repo")
public class RedisConfiguration {
	
	@Value("${spring.data.redis.host}")
    private String redisHost;
    @Value("${spring.data.redis.port}")
    private Integer redisPort;

	@Bean
	JedisConnectionFactory jedisConnectionFactory() {
	  JedisConnectionFactory factory = new JedisConnectionFactory();
	  factory.setHostName(redisHost);
	  factory.setPort(redisPort);
//	  factory.setUsePool(true);
	  return factory;
	}

	@Bean
	public RedisTemplate<String, Object> redisTemplate() {
		final RedisTemplate<String, Object> template = new RedisTemplate<>();
		template.setConnectionFactory(jedisConnectionFactory());
		template.setValueSerializer(new GenericToStringSerializer<>(Object.class));
		return template;
	}

}
