package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestSwapNodesInPairs {
    private SwapNodesInPairs v;

    @Before
    public void setup() {
        v = new SwapNodesInPairs();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(1, 2, 3, 4)).sequence(), is(contains(2, 1, 4, 3)));
    }

    @Test
    public void m1() {
        assertThat(v.m1(new ListNode(1, 2, 3, 4)).sequence(), is(contains(2, 1, 4, 3)));
    }

    @Test
    public void m2() {
        assertThat(v.m2(new ListNode(1, 2, 3, 4)).sequence(), is(contains(2, 1, 4, 3)));
    }
}
