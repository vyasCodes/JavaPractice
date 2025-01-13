package org.example.Generics;

import java.util.List;

public class Utils {
//    Anything that extends the animal class and the animal class is accepted in parameter
    public static <T extends Animal> List<T> printWithGenerics(List<T> x) {
        for (Animal animal : x) {
            System.out.println(animal);
        }

        return x;
    }

//    removing ? extends, we wont be able to accept child classes of the Animal class
    public static void printWithoutGenerics(List<? extends Animal> x) {
        for (Animal animal : x) {
            System.out.println(animal);
        }
    }
}
