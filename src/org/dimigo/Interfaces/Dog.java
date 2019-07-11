package org.dimigo.Interfaces;

public class Dog implements IAnimal{


    public Dog(String 멍멍이) {
    }

    @Override
    public void bark() {

        System.out.println("멍멍");
    }
    public void wag() {
        System.out.println("꼬리를 흔들흔들");
    }
}
