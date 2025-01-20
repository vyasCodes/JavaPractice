package org.example.StreamsAndLamdas;

import java.util.Comparator;

public class UniversityNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.UnivName.compareTo(s2.UnivName);
    }
}
