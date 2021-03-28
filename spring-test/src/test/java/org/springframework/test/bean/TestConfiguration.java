package org.springframework.test.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Joey
 * @version 1.0
 * @date 2021/3/21 15:02
 */
@Configuration
public class TestConfiguration {

	@Bean
	public TestBean initBean(){
		TestBean testBean = new TestBean();
		testBean.setId(1);
		testBean.setName("lalala");
		return testBean;
	}
}
