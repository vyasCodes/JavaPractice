package org.example.Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<String, Double> country = new Pair<String, Double>("India", 1.5);
        country.printValues();
        Pair<String, Integer> student = new Pair<>("Karan", 100);
        student.printValues();

        student.<String>getFirst("Karan vyas");

        List<Animal> a1 = new ArrayList<Animal>();
        List<Dog> d1 = new ArrayList<>();
        List<Cat> c1 = new ArrayList<>();
        Utils.printWithGenerics(d1);
        Utils.printWithoutGenerics(d1);
        Utils.printWithoutGenerics(c1);
    }
}
