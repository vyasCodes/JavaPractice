package org.example.Concurrency.AdderSubtractorSyncMethods;

public class Count {
    int val;
    public Count(int val) {
        this.val = val;
    }

    public synchronized void incrementByX(int x) {
        this.val+=x;
    }
    public synchronized void DecrementByX(int x) {
        this.val-=x;
    }
}
