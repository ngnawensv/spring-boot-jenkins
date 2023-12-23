package com.belrose.springbootjenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class SpringBootJenkinsApplicationTests {

	@Test
	void contextLoads() {
		log.info("Test case executing...");
		log.info("Test case executing last statment...");
		log.info("Test case executing last statment one more time...");
		assertEquals(true,true);
	}

}
