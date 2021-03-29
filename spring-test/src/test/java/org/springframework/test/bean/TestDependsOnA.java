package org.springframework.test.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Joey
 * @version 1.0
 * @date 2021/3/29 20:38
 */
@Component
public class TestDependsOnA {

	@Autowired
	private TestDependsOnB testDependsOnB;

	private void joeyAopTestA(){
		System.out.println("TestDependsOnA:joeyAopTestA");
	}
}
