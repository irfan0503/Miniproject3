package com.training.algorithmtoolkit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnalysisUtilTest {

    @Test
    public void testMeasure() {
        long time = AnalysisUtil.measure(() -> {
            for (int i = 0; i < 10000; i++);
        });
        assertTrue(time >= 0);
    }
}
