package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.core.Is.is;

public class TestRotateList {
    private RotateList v;

    @Before
    public void setup() {
        v = new RotateList();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(new int[]{1, 2, 3, 4, 5}), 2).sequence(), is(contains(4, 5, 1, 2, 3)));
        assertThat(v.m0(new ListNode(new int[]{0, 1, 2}), 4).sequence(), is(contains(2, 0, 1)));
    }
}
