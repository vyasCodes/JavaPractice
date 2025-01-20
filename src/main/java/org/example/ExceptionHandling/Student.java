package org.example.ExceptionHandling;

import java.sql.SQLException;

public class Student {
    public void findStudentByRoll(int roll) throws SQLException, EvenException {
        if (roll < 20) {
            throw new SQLException();
        } else if (roll % 2 == 0) {
            throw new EvenException();
        } else {
            throw new oddException();
        }
    }
}
