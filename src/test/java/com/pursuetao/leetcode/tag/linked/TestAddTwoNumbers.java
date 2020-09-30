package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestAddTwoNumbers {
    AddTwoNumbers v;

    @Before
    public void setUp() {
        v = new AddTwoNumbers();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(2, 4, 3), new ListNode(5, 6, 4)).sequence(), is(contains(7, 0, 8)));
        assertThat(v.m0(new ListNode(3, 4, 5), new ListNode(7, 6, 5)).sequence(), is(contains(0, 1, 1, 1)));
    }
}
