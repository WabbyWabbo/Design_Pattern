package com.fisher.pattern.AbstractFactory.client;

import com.fisher.pattern.AbstractFactory.BenzCar;
import com.fisher.pattern.AbstractFactory.TeslaCar;
import com.fisher.pattern.AbstractFactory.factory.AbstractFactory;
import com.fisher.pattern.AbstractFactory.factory.SportCarFactory;

/**
 * 
 * @author fisher
 *
 */
public class Main {

	public static void main(String[] args) {
        AbstractFactory sportCarFactory = new SportCarFactory();
		
		TeslaCar teslaCar = sportCarFactory.getTeslaCar();
		teslaCar.charge();
		
		BenzCar benzCar = sportCarFactory.getBenzCar();
		benzCar.gasUp();
	}

}

/**
 * AbstractFactory(抽象工厂)：用于声明生成抽象产品的方法
 * ConcreteFactory(具体工厂)：实现了抽象工厂声明的生成抽象产品的方法，生成一组具体产品，这些产品构成了一个产品族，每一个产品都位于某个产品等级结构中；
 * AbstractProduct(抽象产品)：为每种产品声明接口，在抽象产品中定义了产品的抽象业务方法；
 * Product(具体产品)：定义具体工厂生产的具体产品对象，实现抽象产品接口中定义的业务方法。
 */
