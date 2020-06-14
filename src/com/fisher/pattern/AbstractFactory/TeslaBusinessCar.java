package com.fisher.pattern.AbstractFactory;

public class TeslaBusinessCar implements TeslaCar {

	@Override
	public void charge() {
		System.out.println("tesla's business car don't need to be charged to 100%");

	}

}
