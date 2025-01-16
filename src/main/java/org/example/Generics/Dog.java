package org.example.Generics;

public class Dog extends Animal{
    String breed;
    public  Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println("Bark");
    }
}
