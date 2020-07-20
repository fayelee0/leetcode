package com.pursuetao.leetcode.tag.array;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;

public class TestThreeSum {
    private ThreeSum v;

    @Before
    public void setUp() {
        v = new ThreeSum();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new int[]{-1, 0, 1, 2, -1, -4}), is(containsInAnyOrder(
                Arrays.asList(-1, 0, 1),
                Arrays.asList(-1, -1, 2)
        )));
    }
}
