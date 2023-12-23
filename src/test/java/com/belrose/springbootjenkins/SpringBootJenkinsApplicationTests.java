package com.belrose.springbootjenkins;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@Slf4j
class SpringBootJenkinsApplicationTests {

	@Test
	 contextLoads() {
		log.info("Test case executing...");
		log.info("Test case executing... email sent");
		assertEquals(true,true);
	}

}
