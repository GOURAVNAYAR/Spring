package com.springcoreConstructor_Injection;

public class Person {

	private int personId;
	private String personName;
	private MainTest mt;

	public Person(int personId, String personName) {
		this.personId = personId;
		this.personName = personName;
	}

	@Override
	public String toString() {
		return this.personName+ " : "+ this.personId;
	}
	
	

}
