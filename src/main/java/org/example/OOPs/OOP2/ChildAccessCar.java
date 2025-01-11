package org.example.OOPs.OOP2;

import OOPs.OOP1.Car;

public class ChildAccessCar extends Car {
    public static void main(String[] args) {
        ChildAccessCar car = new ChildAccessCar();
        car.model = "Merc";
        car.number = "wb34";
    }
}
