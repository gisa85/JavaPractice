package org.dimigo.abstractclass;

public class BmwEngine extends Engine {
    @Override
    public void startEngine() {
        System.out.println("Bmw엔진 가동");
    }

    @Override
    public void stopEngine() {
        System.out.println("Bmw엔진 멈춤");
    }
}
