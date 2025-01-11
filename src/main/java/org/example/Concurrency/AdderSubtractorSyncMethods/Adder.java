package org.example.Concurrency.AdderSubtractorSyncMethods;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Count c1;
    Adder(Count c1) {
        this.c1 = c1;
    }

    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {
            c1.incrementByX(i);
        }
        return null;
    }
}
