package org.example.Concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MultiThreadedMergeSort implements Callable<List<Integer>> {
    private List<Integer> list;
    private ExecutorService ex;
    public MultiThreadedMergeSort(List<Integer> list, ExecutorService ex) {
        this.list = list;
        this.ex = ex;
    }
    public List<Integer> call() throws Exception {

        if (list.size() <= 1) return list;

        int mid = list.size() / 2;
        List<Integer> leftList = new ArrayList<>();
        List<Integer> rightList = new ArrayList<>();
        for (int i = 0; i < mid; i++) {
            leftList.add(list.get(i));
        }
        for (int i = mid; i < list.size(); i++) {
            rightList.add(list.get(i));
        }

        MultiThreadedMergeSort left = new MultiThreadedMergeSort(leftList, ex);
        MultiThreadedMergeSort right = new MultiThreadedMergeSort(rightList, ex);

        Future<List<Integer>> leftSorted = ex.submit(left);
        Future<List<Integer>> rightSorted = ex.submit(right);


        leftList = leftSorted.get();
        rightList = rightSorted.get();

        List<Integer> sortedList = new ArrayList();
        int i = 0, j = 0;

        while(i < leftList.size() && j < rightList.size()) {
            if (leftList.get(i) < rightList.get(j)) {
                sortedList.add(leftList.get(i));
                i++;
            } else {
                sortedList.add(rightList.get(j));
                j++;
            }
        }

        while (i < leftList.size()) {
            sortedList.add(leftList.get(i));
            i++;
        }

        while (j < rightList.size()) {
            sortedList.add(rightList.get(j));
            j++;
        }

        return sortedList;
    }
}
