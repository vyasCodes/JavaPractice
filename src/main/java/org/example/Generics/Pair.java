package org.example.Generics;

//Class level Generic
public class Pair<A,B> {
    private A first;
    private B second;
    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public void printValues() {
        System.out.println("First: " + first + "\nSecond: " + second);
    }

//    Method level generic
    public <A> A getFirst(A methodGeneric) {
        System.out.println("Method generic: " + methodGeneric);
        return methodGeneric;
    }

//    Class level generic are not accessible form static methods
    public static <T> void printRecieved(T val) {
        System.out.println("Method level generic: " + val);
    }

}
