package org.example.OOPs.OOP1;

public class OOPs1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.model = "BMW";
        c1.number = "WB121";
        c1.noOfSeats = 4;
//        c1.color = "Black";
        Car c2 = new Car(c1);
        c1.printDetails();
        System.out.println("-----------------");
        c2.printDetails();

        c2.model = "Audi";
        c2.number = "wb44";
        System.out.println("=================");
        c1.printDetails();
        System.out.println("-----------------");
        c2.printDetails();
    }
}
