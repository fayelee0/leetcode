package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class TestRemoveDuplicatesFromSortedList {
    private RemoveDuplicatesFromSortedList v;

    @Before
    public void setup() {
        v = new RemoveDuplicatesFromSortedList();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(1, 1, 2)).sequence(), is(contains(1, 2)));
        assertThat(v.m0(new ListNode(1, 1, 2, 3, 3)).sequence(), is(contains(1, 2, 3)));
    }
}
