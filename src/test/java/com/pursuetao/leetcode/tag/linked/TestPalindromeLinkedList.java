package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestPalindromeLinkedList {
    private PalindromeLinkedList v;

    @Before
    public void setup() {
        v = new PalindromeLinkedList();
    }

    @Test
    public void m0() {
        ListNode lst1 = new ListNode(1, 2);
        assertThat(v.m0(lst1), is(false));

        ListNode lst2 = new ListNode(1, 2, 2, 1);
        assertThat(v.m0(lst2), is(true));
    }

    @Test
    public void m1() {
        ListNode lst1 = new ListNode(1, 2);
        assertThat(v.m1(lst1), is(false));

        ListNode lst2 = new ListNode(1, 2, 2, 1);
        assertThat(v.m1(lst2), is(true));

        ListNode lst3 = new ListNode(1, 2, 3, 2, 1);
        assertThat(v.m1(lst3), is(true));
    }

    @Test
    public void m2() {
        ListNode lst1 = new ListNode(1, 2);
        assertThat(v.m2(lst1), is(false));

        ListNode lst2 = new ListNode(1, 2, 2, 1);
        assertThat(v.m2(lst2), is(true));

        ListNode lst3 = new ListNode(1, 2, 3, 2, 1);
        assertThat(v.m2(lst3), is(true));
    }
}
