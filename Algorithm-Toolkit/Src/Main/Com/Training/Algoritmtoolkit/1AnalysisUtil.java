package com.training.algorithmtoolkit;

/**
 * Provides a timer for benchmarking algorithms.
 */
public class AnalysisUtil {

    /**
     * Executes a Runnable and returns execution time in milliseconds.
     */
    public static long measure(Runnable algorithm) {
        long start = System.nanoTime();
        algorithm.run();
        long end = System.nanoTime();
        return (end - start) / 1_000_000; // ms
    }
}
