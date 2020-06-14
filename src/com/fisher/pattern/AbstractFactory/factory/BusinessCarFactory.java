package com.fisher.pattern.AbstractFactory.factory;

import com.fisher.pattern.AbstractFactory.BenzBusinessCar;
import com.fisher.pattern.AbstractFactory.BenzCar;
import com.fisher.pattern.AbstractFactory.TeslaBusinessCar;
import com.fisher.pattern.AbstractFactory.TeslaCar;

public class BusinessCarFactory implements AbstractFactory {

	@Override
	public BenzCar getBenzCar() {
		return new BenzBusinessCar();
	}

	@Override
	public TeslaCar getTeslaCar() {
		return new TeslaBusinessCar();
	}

}
