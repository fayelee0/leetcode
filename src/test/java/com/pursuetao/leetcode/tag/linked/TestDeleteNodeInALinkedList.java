package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestDeleteNodeInALinkedList {
    private DeleteNodeInALinkedList v;

    @Before
    public void setup() {
        v = new DeleteNodeInALinkedList();
    }

    @Test
    public void m0_0() {
        ListNode head = new ListNode(0, 1);

        assertThat(head.sequence(), is(contains(0, 1)));
        v.m0(head);
        assertThat(head.sequence(), is(contains(1)));
    }

    @Test
    public void m1_0() {
        ListNode head = new ListNode(0, 1);

        assertThat(head.sequence(), is(contains(0, 1)));
        v.m1(head);
        assertThat(head.sequence(), is(contains(1)));
    }

    @Test
    public void m0_1() {
        ListNode head = new ListNode(-3, 5, -99);

        assertThat(head.sequence(), is(contains(-3, 5, -99)));
        v.m0(head);
        assertThat(head.sequence(), is(contains(5, -99)));
    }

    @Test
    public void m1_1() {
        ListNode head = new ListNode(-3, 5, -99);

        assertThat(head.sequence(), is(contains(-3, 5, -99)));
        v.m1(head);
        assertThat(head.sequence(), is(contains(5, -99)));
    }

    @Test
    public void m0_2() {
        ListNode part = new ListNode(3, 4);
        ListNode head = new ListNode(1, new ListNode(2, part));

        assertThat(head.sequence(), is(contains(1, 2, 3, 4)));
        v.m0(part);
        assertThat(head.sequence(), is(contains(1, 2, 4)));
    }

    @Test
    public void m1_2() {
        ListNode part = new ListNode(3, 4);
        ListNode head = new ListNode(1, new ListNode(2, part));

        assertThat(head.sequence(), is(contains(1, 2, 3, 4)));
        v.m1(part);
        assertThat(head.sequence(), is(contains(1, 2, 4)));
    }
}
