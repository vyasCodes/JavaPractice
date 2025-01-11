package org.example.OOPs.InheritanceAndPolymorphism;

public class Pegion extends Bird{
    public Pegion(String color, String place) {
        super("Pegion", color, place);
        System.out.println("Pegion Created");
    }
    void fly() {
        System.out.println("Pegion Is Flying");
    }

     String fly(String a) {
        System.out.println("Pegion Is Flying overloaded");
        return "";
    }
}
