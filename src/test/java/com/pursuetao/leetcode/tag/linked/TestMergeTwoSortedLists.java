package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestMergeTwoSortedLists {
    private MergeTwoSortedLists v;

    @Before
    public void setUp() {
        v = new MergeTwoSortedLists();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(1, 2, 4), new ListNode(1, 3, 4)).sequence(), is(contains(1, 1, 2, 3, 4, 4)));
    }

    @Test
    public void m1() {
        assertThat(v.m1(new ListNode(1, 2, 4), new ListNode(1, 3, 4)).sequence(), is(contains(1, 1, 2, 3, 4, 4)));
    }

    @Test
    public void m2() {
        assertThat(v.m2(new ListNode(1, 2, 4), new ListNode(1, 3, 4)).sequence(), is(contains(1, 1, 2, 3, 4, 4)));
    }
}
