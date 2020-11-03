package com.yyq.springbootjwtredis;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.Arrays;

@SpringBootTest
class SpringbootJwtRedisApplicationTests {

	@Autowired
	RedisTemplate redisTemplate;

	@Test
	void contextLoads() {

//		ValueOperations valueOperations = redisTemplate.opsForValue();
//
//		valueOperations.set("yyq_tes","hello");

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name","yyq");
		jsonObject.put("age",23);
		jsonObject.put("aihao", Arrays.asList("book","game"));

		redisTemplate.opsForValue().set("yyq_test2",jsonObject);
	}

}
