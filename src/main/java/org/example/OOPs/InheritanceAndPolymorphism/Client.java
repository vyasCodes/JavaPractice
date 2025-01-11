package org.example.OOPs.InheritanceAndPolymorphism;

public class Client {
    public static void main(String[] args) {
        Bird b1 = new Pegion("Grey", "India");
        b1.fly();
        Bird b2 = new Bird("Unknown", "Grey", "India");
        b2.fly();

        b2.fly("sd");
    }
//    Bird b = new Bird();
//    {
//        b.fly();
//    }
}
