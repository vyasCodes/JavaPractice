package org.example.Concurrency.AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Count c1;
    Lock lock;
    Subtractor(Count c1, Lock lock) {
        this.lock = lock;
        this.c1 = c1;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            lock.lock();
            this.c1.val -= i;
            lock.unlock();
        }
        return null;
    }
}
