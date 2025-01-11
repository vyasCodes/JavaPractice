package org.example.Concurrency;

public class PrintString extends Thread {
    private String message;
    public PrintString(String message) {
        this.message = message;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " prints " + this.message);
    }
}
