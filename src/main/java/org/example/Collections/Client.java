package org.example.Collections;


import java.util.*;

public class Client {
    public static void main(String[] args) {
//     Collection is the root interface extended by ---> List, Set, Queue

//     List interface is implemented by ---> LinkedList, ArrayList, Vector-->Stack

//        ArrayList-->Based on arrays, Maintains order, is not thread safe
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        System.out.println(l1);

//        LinkedList-->Maintains order, is not thread safe
        List<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        System.out.println(l2);

//        Vectors-->Just like ArrayList, but is Thread safe
        List<Integer> l3 = new Vector<>();
        l3.add(1);
        l3.add(2);
        l3.add(3);
        l3.add(4);
        l3.remove(2);
        System.out.println(l3);

//        Stack-->Extended by Vector and thread safe
//        List<Integer> stack = new Stack<>();
        Stack<Integer> s1 = new Stack<>();
//        s1.add(1);
//        s1.remove(0);
        s1.add(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.pop();
        System.out.println(s1);



//        Set interface ---> Extends Collection interface, not thread safe,contains unique elements
//        Constant time operations


//        Hashset-->Order is not preserved
//        Set<Integer> s2 = new HashSet<>();
//        s2.add(88);
//        s2.add(2);
//        s2.add(33);
//        s2.add(4);
//        s2.add(56);
//        System.out.println(s2);
        Set<String> s2 = new HashSet<>();
        s2.add("Karan");
        s2.add("Umang");
        s2.add("Swati");
        s2.add("Shrusti");
        System.out.println(s2);

//        TreeSet--> Ordered lexographically(int asc order, string alphabatically)
        Set<Integer> s3 = new TreeSet<>();
        s3.add(11);
        s3.add(2);
        s3.add(0);
        s3.add(9);
        System.out.println(s3);

//        LinkedHashSet--> Order preserved
        Set<Integer> s4 = new LinkedHashSet<>();
        s4.add(1);
        s4.add(22);
        s4.add(3);
        s4.add(3);
        s4.add(4);
        System.out.println(s4);

//        Queue
        Queue<String> q1 = new PriorityQueue<>();
        q1.add("Karan");
        q1.add("Umang");
        q1.add("Swati");
        q1.add("Shrusti");
        System.out.println(q1);
//        System.out.println(q1.poll());
//        System.out.println(q1.poll());
//        System.out.println(q1.poll());
//        System.out.println(q1.poll());

        Queue<String> names = new PriorityQueue<>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        names.add("Karan");
        names.add("Umang");
        names.add("Swati");
        names.add("Shrusti");
        System.out.println(names);

        System.out.println("----------------Comparator & Comparable----------------");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Karan", 85, "IGNOU"));
        students.add(new Student("Umang", 90, "ABS"));
        students.add(new Student("Swati", 80, "IGNOU"));
        students.add(new Student("Jyoti", 85, "Xavier"));
        students.add(new Student("Shrusti", 70, "Ram"));

        for (Student student : students) {
            System.out.println("Student: " + student.name + " PSP: " + student.psp);
        }

        System.out.println("-----Sorted using comparable--------");

        Collections.sort(students);
        for (Student student : students) {
            System.out.println("Student: " + student.name + " PSP: " + student.psp);
        }

        System.out.println("-----Sorted using comparator--------");
        Collections.sort(students, new UniversityNameComparator());
        for (Student student : students) {
            System.out.println("Student: " + student.name + " PSP: " + student.psp +
                    " University: " + student.UnivName);
        }

    }
}
