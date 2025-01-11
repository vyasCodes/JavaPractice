package org.example.Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
//        for (int i = 0; i <= 100; i++) {
//            Thread t = new Thread(new PrintNumbers(i));
//            t.start();
//
//        }
//
//        PrintString ps = new PrintString("Hello World");
//        ps.start();

        List<Integer> ls = new ArrayList<>();
        ls.add(13);
        ls.add(23);
        ls.add(12);
        ls.add(1);
        ls.add(656);
        ls.add(34);
        ls.add(13);
        ls.add(1);
        ls.add(0);
        System.out.println(ls);
        ExecutorService ex = Executors.newCachedThreadPool();

        MultiThreadedMergeSort sort = new MultiThreadedMergeSort(ls, ex);
        Future<List<Integer>> sortedFuture = ex.submit(sort);
        ls = sortedFuture.get();

        System.out.println(ls);
        ex.shutdown();

    }
}
