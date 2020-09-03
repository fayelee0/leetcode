package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestMiddleOfTheLinkedList {
    private MiddleOfTheLinkedList v;

    @Before
    public void setup() {
        v = new MiddleOfTheLinkedList();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(new int[]{1, 2, 3, 4, 5})).sequence(), is(contains(3, 4, 5)));
        assertThat(v.m0(new ListNode(new int[]{1, 2, 3, 4})).sequence(), is(contains(3, 4)));
        assertThat(v.m0(new ListNode(new int[]{1, 2, 3, 4, 5, 6})).sequence(), is(contains(4, 5, 6)));
    }
}
