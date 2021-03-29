package org.springframework.test.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Joey
 * @version 1.0
 * @date 2021/3/29 22:09
 */
@Component
public class TestPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("TestPostProcessor我是谁？"+beanName);
		return bean;
	}
}
