package com.imti.algo.simple.test;

import com.imti.algo.simple.SelectionSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by imti on 15/8/16.
 */
public class SelectionSortTest {

    @Test
    public void testSorting() {
        // int[] inputDataSet = {3, 21, 14, 90, 32, 23, 45, 87, 92, 31, 19};
        int[] inputDataSet = {3, 14, 19, 21, 23, 31, 32, 45, 87, 90, 92};
        System.out.println("Input Data Sets: " + Arrays.toString(inputDataSet));
        SelectionSort.doSorting(inputDataSet);
        System.out.println("Output Data Sets: " + Arrays.toString(inputDataSet));
    }

}
