package com.fisher.pattern.AbstractFactory.factory;

import com.fisher.pattern.AbstractFactory.BenzCar;
import com.fisher.pattern.AbstractFactory.TeslaCar;

public interface AbstractFactory {
	public BenzCar getBenzCar();
	public TeslaCar getTeslaCar();
	
}
