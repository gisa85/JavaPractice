package org.dimigo.Interfaces;

public interface IAnimal {
    //상수(자동으로 public static final이붙음)
    String FARM_NAME = "디미동물농장";



    //Method(저절로 public abstract가붙음)
    //void eat();
    //void sleep();
    void bark();

    //jDK8부터
    default void eat() {
        System.out.println("냠냠");
    }

    default void sleep() {

        System.out.println("쿨쿨");
    }

    //static메소드
    public static void welcome() {
        System.out.println("웰컴투" +FARM_NAME);
    }
}
