package org.example.StreamsAndLamdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Student> s1 = new ArrayList<>();
        s1.add(new Student("Karan", 88, "ABC"));
        s1.add(new Student("Swati", 90, "XYz"));
        s1.add(new Student("Shrusti", 85, "Scaler"));
        s1.add(new Student("Anirudh", 88, "KS"));

//        Sorting s1
//        Natural order defined inside the class using compare method
        Collections.sort(s1);
        printStudents(s1);

//        Using Comparator
        Collections.sort(s1, new UniversityNameComparator());
        printStudents(s1);

//        Using LAMDA Expression
        Collections.sort(s1, (Student s, Student s2) -> {
            return s.name.compareTo(s2.name);
        });
        printStudents(s1);

//        Printing hello world from diff thread using lamda expression
        Thread t1 = new Thread(() -> {
            System.out.println("Hello world" + " Thread t1");
        });
        t1.start();

        Runnable r1 = () -> System.out.println("Hello world");
        Thread t2 = new Thread(r1 );
        t2.start();

        //        Using custom functional interface

        System.out.println("Lamda using custom interface");
        ArithmeticOperation addOp = (int a, int b) -> a + b;
        ArithmeticOperation subOp = (int a, int b) -> a - b;
        ArithmeticOperation mulOp = (int a, int b) -> a * b;
        ArithmeticOperation divOp = (int a, int b) -> a / b;
        ArithmeticOperation modOp = (int a, int b) -> a % b;

        System.out.println(addOp.operate(5,5));
        System.out.println(subOp.operate(5,5));
        System.out.println(mulOp.operate(5,5));
        System.out.println(divOp.operate(5,5));
        System.out.println(modOp.operate(5,5));

//        STREAMS
        List<Integer> ls1 = new ArrayList<>();
        for (int i = 0 ; i < 11; i++) ls1.add(i);
        ls1.stream().forEach((e) -> System.out.print(e + " "));
        System.out.println("");
        List<Integer> ls2 = ls1.stream().filter((e) -> e >= 5).map(e -> e*e).collect(Collectors.toList());
        System.out.println(ls2);

    }

    public static void printStudents(List<Student> students) {
        for (Student student : students) {
            System.out.println(student.name + " PSP: " + student.psp + " Univ: " + student.UnivName);
        }
        System.out.println("----------------------------------");
    }
}
