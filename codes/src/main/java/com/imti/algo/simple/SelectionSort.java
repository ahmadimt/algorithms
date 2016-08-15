package com.imti.algo.simple;

/**
 * Created by imti on 15/8/16.
 */
public class SelectionSort {

    public static void doSorting(int[] inputDataSet) {

        //This outer loop places the smallest number found by inner loop at its position
        for (int i = 0; i < inputDataSet.length - 1; i++) {
            int minIdx = i;
            //This inner loop finds the next smallest number
            for (int j = i + 1; j < inputDataSet.length; j++) {
                if (inputDataSet[j] < inputDataSet[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = inputDataSet[minIdx];
            inputDataSet[minIdx] = inputDataSet[i];
            inputDataSet[i] = tmp;
        }
    }

}
