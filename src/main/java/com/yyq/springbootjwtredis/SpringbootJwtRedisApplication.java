package com.yyq.springbootjwtredis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dt
 */
@SpringBootApplication
@RestController
public class SpringbootJwtRedisApplication {

	@Autowired
	RedisTemplate redisTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootJwtRedisApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello()
	{
//		redisTemplate.opsForValue().set
		return "Hello Springboot!";
	}
}
