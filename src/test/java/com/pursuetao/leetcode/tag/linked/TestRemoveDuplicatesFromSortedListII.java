package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class TestRemoveDuplicatesFromSortedListII {
    private RemoveDuplicatesFromSortedListII v;

    @Before
    public void setup() {
        v = new RemoveDuplicatesFromSortedListII();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(new int[]{1, 2, 3, 3, 4, 4, 5})).sequence(), is(contains(1, 2, 5)));
    }

    @Test
    public void m1() {
        assertThat(v.m1(new ListNode(new int[]{1, 2, 3, 3, 4, 4, 5})).sequence(), is(contains(1, 2, 5)));
    }
}
