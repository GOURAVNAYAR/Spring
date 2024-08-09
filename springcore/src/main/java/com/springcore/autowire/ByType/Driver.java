package com.springcore.autowire.ByType;

public class Driver {

	private Car car;

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Driver [car=" + car + "]";
	}

}
