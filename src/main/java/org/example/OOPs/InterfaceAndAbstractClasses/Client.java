package org.example.OOPs.InterfaceAndAbstractClasses;

public class Client {
    public static void main(String[] args) {
        Animal tiger = new Tiger(5);
        tiger.eat();
        tiger.sleep();
        tiger.move();
        ((Tiger)tiger).printType();
        System.out.println(Tiger.type);;
        Tiger t1 = new Tiger(5);
        t1.printType();
    }
}
