package com.fisher.pattern.AbstractFactory;

public class TeslaSportCar implements TeslaCar {

	@Override
	public void charge() {
		System.out.println("charge to 100%");

	}

}
