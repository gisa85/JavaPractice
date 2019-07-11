package org.dimigo.Interfaces;


public class BenzEngine implements IEngine {


    public void startEngine() {
        System.out.println("Benz엔진 가동");
    }

    public void stopEngine() {
        System.out.println("Benz엔진 멈춤");
    }
}
