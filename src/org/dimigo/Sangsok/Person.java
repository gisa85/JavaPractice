package org.dimigo.Sangsok;

public class Person {

    private String name;
    public Person() {}
    public Person(String name)
    {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello");

    }
    public void sayBye(){
        System.out.println("Bye");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "저는" + name + "입니다.";
    }
}

/*
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("냠냠");

    }

    public void sleep() {
        System.out.println("culcul");
    }

    public void bark() {
        System.out.println("mungmung");
    }

    public String toString(){
        return "제이름은" + name + "입니다";
    }
}

 */