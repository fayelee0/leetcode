package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestMergeKSortedLists {
    private MergeKSortedLists v;

    @Before
    public void setup() {
        v = new MergeKSortedLists();
    }

    @Test
    public void m0() {
        ListNode l1 = new ListNode(new int[]{1, 4, 5});
        ListNode l2 = new ListNode(new int[]{1, 3, 4});
        ListNode l3 = new ListNode(new int[]{2, 6});

        assertThat(v.m0(new ListNode[]{l1, l2, l3}).sequence(), is(contains(1, 1, 2, 3, 4, 4, 5, 6)));
    }

    @Test
    public void m1() {
        ListNode l1 = new ListNode(new int[]{1, 4, 5});
        ListNode l2 = new ListNode(new int[]{1, 3, 4});
        ListNode l3 = new ListNode(new int[]{2, 6});
        assertThat(v.m1(new ListNode[]{l1, l2, l3}).sequence(), is(contains(1, 1, 2, 3, 4, 4, 5, 6)));
    }
}
