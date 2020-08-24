package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestReverseLinkedListII {
    private ReverseLinkedListII v;

    @Before
    public void setup() {
        v = new ReverseLinkedListII();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(new int[]{1, 2, 3, 4, 5}), 2, 4).sequence(), is(contains(1, 4, 3, 2, 5)));
        assertThat(v.m0(new ListNode(new int[]{1, 2, 3, 4, 5}), 2, 5).sequence(), is(contains(1, 5, 4, 3, 2)));
    }

    @Test
    public void m1() {
        assertThat(v.m1(new ListNode(new int[]{1, 2, 3, 4, 5}), 2, 4).sequence(), is(contains(1, 4, 3, 2, 5)));
        assertThat(v.m1(new ListNode(new int[]{1, 2, 3, 4, 5}), 2, 5).sequence(), is(contains(1, 5, 4, 3, 2)));
    }
}
