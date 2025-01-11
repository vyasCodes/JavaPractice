package org.example.Concurrency;

public class PrintNumbers implements Runnable {
    private int number;
    PrintNumbers(int number) {
        this.number = number;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " prints " + this.number);
    }
}
