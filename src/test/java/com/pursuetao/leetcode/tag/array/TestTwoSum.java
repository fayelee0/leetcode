package com.pursuetao.leetcode.tag.array;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContainingInAnyOrder;
import static org.hamcrest.Matchers.is;

public class TestTwoSum {
    TwoSum v;

    @Before
    public void setUp() {
        v = new TwoSum();
    }

    @Test
    public void m0() {
        assertThat(ArrayUtils.toObject(v.m0(new int[]{2, 7, 11, 15}, 9)), is(arrayContainingInAnyOrder(0, 1)));
    }
}
