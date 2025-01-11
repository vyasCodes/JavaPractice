package org.example.OOPs.InterfaceAndAbstractClasses;

public class Sparrow extends Bird implements Flyable {
    Sparrow() {
        super("Sparrow", "Coffee Brown");
    }

    public void fly() {
        System.out.println("Sparrow fly");
    }
}
