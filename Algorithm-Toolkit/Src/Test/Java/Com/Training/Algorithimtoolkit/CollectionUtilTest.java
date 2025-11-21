package com.training.algorithmtoolkit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionUtilTest {

    @Test
    public void testStack() {
        CollectionUtil<Integer> util = new CollectionUtil<>();
        util.push(10);
        util.push(20);
        assertEquals(20, util.pop());
    }

    @Test
    public void testQueue() {
        CollectionUtil<String> util = new CollectionUtil<>();
        util.enqueue("A");
        util.enqueue("B");
