package org.example.StreamsAndLamdas;

public class Student implements Comparable<Student> {
     String name;
     double psp;
     String UnivName;



    public Student(String name, double psp, String UnivName) {
        this.name = name;
        this.psp = psp;
        this.UnivName = UnivName;
    }

    @Override
    public int compareTo(Student student) {
        if (this.psp < student.psp) {
            return -1;
        } else if (this.psp > student.psp) {
            return 1;
        } else {
            return this.name.compareTo(student.name);
        }
    }
}
