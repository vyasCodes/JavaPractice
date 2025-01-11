package org.example.OOPs.InterfaceAndAbstractClasses;

public class Bird {
    String name;
    String color;

    Bird(String name, String color) {
        this.name = name;
        this.color = color;
    }

    void fly() {
        System.out.println("Bird fly");
    }
}
