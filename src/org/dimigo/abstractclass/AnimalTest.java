package org.dimigo.abstractclass;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = {
                new Duck(),new Pig(),new Cow()
        };
        System.out.println("==평온한 동물농장===");
        for (Animal a : animals){
            a.eat();
        }
        System.out.println("==늑대등장==");
        for(Animal b : animals) {
            b.bark();
        }
    }
}
