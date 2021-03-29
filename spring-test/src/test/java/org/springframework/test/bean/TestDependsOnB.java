package org.springframework.test.bean;

import org.springframework.stereotype.Component;

/**
 * @author Joey
 * @version 1.0
 * @date 2021/3/29 20:38
 */
@Component
public class TestDependsOnB {

	private TestDependsOnA testDependsOnA;

	private void joeyAopTestB(){
		System.out.println("TestDependsOnB:joeyAopTestB");
	}
}
