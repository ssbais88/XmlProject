package com.app.life;

public class Cat {

	private int age;
	private int weight;

	public Cat() {
		super();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void init() {
		System.out.println("Init method is called");
	}
	
	public void destroy() {
		System.out.println("Destroy called!!!");
	}

	@Override
	public String toString() {
		return "Cat [age=" + age + ", weight=" + weight + "]";
	}

}
