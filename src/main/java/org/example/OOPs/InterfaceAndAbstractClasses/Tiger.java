package org.example.OOPs.InterfaceAndAbstractClasses;

public class Tiger extends Animal {
    Tiger(int age) {
        this.name = "Tiger";
        this.age = age;
    }

    void eat() {
        System.out.println("Tiger eats");
    }

    void sleep() {
        System.out.println("Tiger sleeps");
    }

    @Override
    void move() {
        System.out.println("Tiger moves");
    }

    public void printType() {
        System.out.println(this.type);
    }
}
