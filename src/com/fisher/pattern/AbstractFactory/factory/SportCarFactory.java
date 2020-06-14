package com.fisher.pattern.AbstractFactory.factory;

import com.fisher.pattern.AbstractFactory.BenzCar;
import com.fisher.pattern.AbstractFactory.BenzSportCar;
import com.fisher.pattern.AbstractFactory.TeslaCar;
import com.fisher.pattern.AbstractFactory.TeslaSportCar;

public class SportCarFactory implements AbstractFactory {

	@Override
	public BenzCar getBenzCar() {
		return new BenzSportCar();
	}

	@Override
	public TeslaCar getTeslaCar() {
		return new TeslaSportCar();
	}

}
