package com.imti.algo.simple;

/**
 * Created by imti on 15/8/16.
 */
public class InsertionSort {
    public static void doSorting(int[] inputDataSet) {
        for (int i = 1; i < inputDataSet.length; i++) {
            int j = i;
            while (j > 0 && inputDataSet[j] < inputDataSet[j - 1]) {
                int tmp = inputDataSet[j - 1];
                inputDataSet[j - 1] = inputDataSet[j];
                inputDataSet[j] = tmp;
                j--;
            }
        }
    }
}
