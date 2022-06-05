package com.example.coffee;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Application -> Controller -> Service   -> Repository -> Entity
 * (노노)          (단위테스트)    (단위테스트)   (단위테스트) -> (노노)
 * (통합테스트)     (통합테스트)    (노노)        (노노)      -> (노노)
 */

@SpringBootTest
class CoffeeApplicationTests {

	@DisplayName("CoffeeApplication 이 실행된 상황에서, contextLoads() 메소드가 실행될 때, 정상으로 앱이 실행되어야 합니다.")
	@Test
	void contextLoads() {
	}
}
