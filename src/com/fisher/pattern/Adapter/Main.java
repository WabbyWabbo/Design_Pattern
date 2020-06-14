package com.fisher.pattern.Adapter;

/**
 * Created by hollis on 16/5/10.
 */
public class Main {

    public static void main(String[] args) {
        Iphone6Plus iphone6Plus = new Iphone6Plus(new AppleCharger());
        iphone6Plus.charge();

        System.out.println("==============================");

        GalaxyS7 galaxyS7 = new GalaxyS7(new AndroidCharger());
        galaxyS7.charge();

        System.out.println("==============================");
        
        Iphone6Plus newIphone = new Iphone6Plus();
        //适配器内部有一个安卓充电头，但适配器对外仍然是实行lightning标准的
        Adapter adapter  = new Adapter(new AndroidCharger());
        //让iPhone的充电头连接到适配器上
        newIphone.setLightningInterface(adapter);
        newIphone.charge();
    }
}
/*
 * Target：目标抽象类,定义客户要用的特定领域的接口(如iPhone需要的LightningInterface);
 * Adapter：适配器类,调用另一个接口，作为一个转换器，对Adaptee和Target进行适配，它是适配器模式的核心;
 * Adaptee：适配者类,它定义了一个已经存在的接口,这个接口需要适配(如MicoUsbInterface);
 * Client：客户类,针对Target进行编程,调用在Target中定义的业务方法(iPhone中的charge()方法需要调用LightningInterface中的方法).
*/