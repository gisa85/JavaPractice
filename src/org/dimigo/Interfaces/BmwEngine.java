package org.dimigo.Interfaces;

import org.dimigo.abstractclass.Engine;

public class BmwEngine implements IEngine {

    public void startEngine() {
        System.out.println("Bmw엔진 가동");
    }

    public void stopEngine() {
        System.out.println("Bmw엔진 멈춤");
    }
}
