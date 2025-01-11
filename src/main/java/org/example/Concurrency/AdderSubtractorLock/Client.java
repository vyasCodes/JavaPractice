package org.example.Concurrency.AdderSubtractorLock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws Exception {
        Count c1 = new Count(0);
        Lock lock = new ReentrantLock();

        Adder task1 = new Adder(c1, lock);
        Subtractor task2 = new Subtractor(c1, lock);

        ExecutorService ex = Executors.newCachedThreadPool();

        Future<Void> val1 = ex.submit(task1);
        Future<Void> val2 = ex.submit(task2);
        val1.get();
        val2.get();
        System.out.println(c1.val);
    }
}
