package com.training.algorithmtoolkit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortingUtilTest {

    @Test
    public void testBubbleSort() {
        int[] arr = {5, 2, 9, 1};
        SortingUtil.bubbleSort(arr);
        assertArrayEquals(new int[]{1,2,5,9}, arr);
    }

    @Test
    public void testMergeSort() {
        int[] arr = {10, -1, 3, 5};
        SortingUtil.mergeSort(arr);
        assertArrayEquals(new int[]{-1,3,5,10}, arr);
    }
}
