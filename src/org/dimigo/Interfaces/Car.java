package org.dimigo.Interfaces;

import org.dimigo.abstractclass.Engine;

public class Car {
    private IEngine engine;

    public void setEngine(IEngine engine){
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
    }
    public void stop() {
        engine.stopEngine();
    }
}
