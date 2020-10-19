package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestIntersectionOfTwoLinkedList {
    private IntersectionOfTwoLinkedList v;

    @Before
    public void setup() {
        v = new IntersectionOfTwoLinkedList();
    }

    @Test
    public void m0_0() {
        ListNode part = new ListNode(8, 4, 5);
        ListNode lst1 = new ListNode(4, new ListNode(1, part));
        ListNode lst2 = new ListNode(5, new ListNode(6, new ListNode(1, part)));

        assertThat(v.m0(lst1, lst2).sequence(), is(contains(8, 4, 5)));
    }

    @Test
    public void m0_1() {
        ListNode part = new ListNode(8, 4, 5);
        ListNode lst1 = new ListNode(4, new ListNode(1, new ListNode(1, part)));
        ListNode lst2 = new ListNode(5, new ListNode(6, new ListNode(1, part)));

        assertThat(v.m0(lst1, lst2).sequence(), is(contains(8, 4, 5)));
    }

    @Test
    public void m0_2() {
        ListNode lst1 = new ListNode(4, 1, 1);
        ListNode lst2 = new ListNode(5, 6, 7);

        assertThat(v.m0(lst1, lst2), is(nullValue()));
    }

    @Test
    public void m1_0() {
        ListNode part = new ListNode(8, 4, 5);
        ListNode lst1 = new ListNode(4, new ListNode(1, part));
        ListNode lst2 = new ListNode(5, new ListNode(6, new ListNode(1, part)));

        assertThat(v.m1(lst1, lst2).sequence(), is(contains(8, 4, 5)));
    }

    @Test
    public void m1_1() {
        ListNode part = new ListNode(8, 4, 5);
        ListNode lst1 = new ListNode(4, new ListNode(1, new ListNode(1, part)));
        ListNode lst2 = new ListNode(5, new ListNode(6, new ListNode(1, part)));

        assertThat(v.m1(lst1, lst2).sequence(), is(contains(8, 4, 5)));
    }

    @Test
    public void m1_2() {
        ListNode lst1 = new ListNode(4, 1, 1);
        ListNode lst2 = new ListNode(5, 6, 7);

        assertThat(v.m1(lst1, lst2), is(nullValue()));
    }

    @Test
    public void m2_0() {
        ListNode part = new ListNode(8, 4, 5);
        ListNode lst1 = new ListNode(4, new ListNode(1, part));
        ListNode lst2 = new ListNode(5, new ListNode(6, new ListNode(1, part)));

        assertThat(v.m2(lst1, lst2).sequence(), is(contains(8, 4, 5)));
    }

    @Test
    public void m2_1() {
        ListNode part = new ListNode(8, 4, 5);
        ListNode lst1 = new ListNode(4, new ListNode(1, new ListNode(1, part)));
        ListNode lst2 = new ListNode(5, new ListNode(6, new ListNode(1, part)));

        assertThat(v.m2(lst1, lst2).sequence(), is(contains(8, 4, 5)));
    }

    @Test
    public void m2_2() {
        ListNode lst1 = new ListNode(4, 1, 1);
        ListNode lst2 = new ListNode(5, 6, 7);

        assertThat(v.m2(lst1, lst2), is(nullValue()));
    }
}
