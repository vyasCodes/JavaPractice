package org.example.OOPs.InheritanceAndPolymorphism;

public class Bird {
    String color;
    String name;
    String nativePlace;

    public Bird(String name, String color, String nativePlace) {
        System.out.println("Bird created");
        this.name = name;
        this.color = color;
        this.nativePlace = nativePlace;
    }

    void fly() {
        System.out.println("Bird class Fly()");
//        return "Bird class Fly()";
    }

    Object fly(String f) {
        System.out.println("Bird class Fly() overloaded");
        return "Bird class Fly() overloaded";
    }


}
