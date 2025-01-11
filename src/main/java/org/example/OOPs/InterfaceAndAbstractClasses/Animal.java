package org.example.OOPs.InterfaceAndAbstractClasses;

public abstract class Animal {
    String name;
    int age;
    static String type = "Mammal";

    abstract void eat();
    abstract void sleep();
    void move() {
        System.out.println("Animal moves");
    }

}
