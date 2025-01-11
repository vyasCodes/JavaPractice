package org.example.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(10);
        ExecutorService ex1 = Executors.newCachedThreadPool();

        for (int i = 1; i <= 100; i++) {
            ex1.submit(new PrintNumbers(i));
        }
        ex1.shutdown();
    }
}
