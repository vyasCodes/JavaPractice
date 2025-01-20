package org.example.ExceptionHandling;

import java.sql.SQLException;

public class Client {
//    TWO types of Exceptions -->
//    1. Runtime/Unchecked Exception--> Ex: IndexOutOfBounds, Arithmetic etc.
//    2. Unchecked/Compile time Exception--> SQLException etc.
//    Try avoiding runtime exception by good code, and use try catch for checked exceptions
    public static void main(String[] args) {
        Student s1 = new Student();

        try {
            s1.findStudentByRoll(2);
        } catch (SQLException s) {
            System.out.println("SQL Exception caught");
        } catch (EvenException e) {
            System.out.println("Even Exception caught");
        } catch (oddException o) {
            System.out.println("odd Exception caught");
        } finally {
            System.out.println("Finally executes any way");
        }
    }
}
