package com.training.algorithmtoolkit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SearchUtilTest {

    @Test
    public void testLinearSearch() {
        assertEquals(2, SearchUtil.linearSearch(new int[]{4,5,6}, 6));
    }

    @Test
    public void testBinarySearch() {
        assertEquals(1, SearchUtil.binarySearch(new int[]{3,7,9}, 7));
    }
}
