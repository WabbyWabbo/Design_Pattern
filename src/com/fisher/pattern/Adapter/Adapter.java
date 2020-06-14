package com.fisher.pattern.Adapter;

/**
 * Created by hollis on 16/5/10.
 * 适配器,将MicroUsb接口转成Lightning接口
 */
public class Adapter implements LightningInterface {
    private MicroUsbInterface microUsbInterface;

    public Adapter() {
    }

    public Adapter(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    @Override
    public void chargeWithLightning() {
        microUsbInterface.chargeWithMicroUsb();
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
/*
 * 该适配器的功能是把一个MicroUsb转换成Lightning。
 * 实现方式是实现目标类的接口（LightningInterface），然后使用组合的方式，在该适配器中定义microUsb。
 * 然后在重写的chargeWithLightning（）方法中，采用microUsb的方法来实现具体细节。
 * */
