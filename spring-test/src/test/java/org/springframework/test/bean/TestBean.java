package org.springframework.test.bean;

/**
 * @author Joey
 * @version 1.0
 * @date 2021/3/21 15:04
 */
public class TestBean {

	private int id;

	private String name;

	public int getId() {
		return id;
	}

	public TestBean setId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public TestBean setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String toString() {
		return "TestBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
