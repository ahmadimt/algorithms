package com.imti.algo.simple.test;

import com.imti.algo.simple.InsertionSort;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by imti on 15/8/16.
 */
public class InsertionSortTest {

    @Test
    public void testSorting() {
        int[] inputDataSet = {3,21,14,90,32, 23, 45, 87, 92, 31, 19};
        System.out.println("Input Data Sets: " + Arrays.toString(inputDataSet));
        InsertionSort.doSorting(inputDataSet);
        System.out.println("Output Data Sets: " + Arrays.toString(inputDataSet));
    }

}

