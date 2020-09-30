package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestRemoveNthNodeFromEndOfList {
    private RemoveNthNodeFromEndOfList v;

    @Before
    public void setUp() {
        v = new RemoveNthNodeFromEndOfList();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(1, 2, 3, 4, 5), 1).sequence(), is(Arrays.asList(1, 2, 3, 4)));
        assertThat(v.m0(new ListNode(1, 2, 3, 4, 5), 2).sequence(), is(Arrays.asList(1, 2, 3, 5)));
        assertThat(v.m0(new ListNode(1, 2, 3, 4, 5), 3).sequence(), is(Arrays.asList(1, 2, 4, 5)));
        assertThat(v.m0(new ListNode(1, 2, 3, 4, 5), 4).sequence(), is(Arrays.asList(1, 3, 4, 5)));
        assertThat(v.m0(new ListNode(1, 2, 3, 4, 5), 5).sequence(), is(Arrays.asList(2, 3, 4, 5)));
    }

    @Test
    public void m1() {
        assertThat(v.m1(new ListNode(1, 2, 3, 4, 5), 1).sequence(), is(Arrays.asList(1, 2, 3, 4)));
        assertThat(v.m1(new ListNode(1, 2, 3, 4, 5), 2).sequence(), is(Arrays.asList(1, 2, 3, 5)));
        assertThat(v.m1(new ListNode(1, 2, 3, 4, 5), 3).sequence(), is(Arrays.asList(1, 2, 4, 5)));
        assertThat(v.m1(new ListNode(1, 2, 3, 4, 5), 4).sequence(), is(Arrays.asList(1, 3, 4, 5)));
        assertThat(v.m1(new ListNode(1, 2, 3, 4, 5), 5).sequence(), is(Arrays.asList(2, 3, 4, 5)));
    }
}
