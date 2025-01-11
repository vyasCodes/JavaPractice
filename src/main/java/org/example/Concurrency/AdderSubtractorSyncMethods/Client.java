package org.example.Concurrency.AdderSubtractorSyncMethods;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        Count c1 = new Count(0);

        Adder task1 = new Adder(c1);
        Subtractor task2 = new Subtractor(c1);

        ExecutorService ex = Executors.newCachedThreadPool();

        Future<Void> val1 = ex.submit(task1);
        Future<Void> val2 = ex.submit(task2);
        val1.get();
        val2.get();
        System.out.println(c1.val);
    }
}
