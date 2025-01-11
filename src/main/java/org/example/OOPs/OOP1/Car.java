package org.example.OOPs.OOP1;

public class Car {
    public String model;
    protected String number;
    private String color;
    int noOfSeats;

    public Car() {
        System.out.println("Car with no constructor");
    }

    public Car(Car car) {
        this.model = car.model;
        this.number = car.number;
        this.color = car.color;
        this.noOfSeats = car.noOfSeats;
    }

    public Car(String model, String number, String color, int noOfSeats) {
        this.model = model;
        this.number = number;
        this.color = color;
        this.noOfSeats = noOfSeats;
    }

    public Car(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public void move() {
        System.out.println("Car on the Move");
    }

    public void startEngine() {
        System.out.println("Car Engine Started");
    }

    public void stopEngine() {
        System.out.println("Car Engine Stopped");
    }

    public void printDetails() {
        System.out.println("Model: " + model);
        System.out.println("Number: " + number);
        System.out.println("Color: " + color);
        System.out.println("Number of Seats: " + noOfSeats);
    }
}
