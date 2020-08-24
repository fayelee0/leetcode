package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class TestPartitionList {
    private PartitionList v;

    @Before
    public void setup() {
        v = new PartitionList();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(new int[]{1, 4, 3, 2, 5, 2}), 3).sequence(), is(contains(1, 2, 2, 4, 3, 5)));
    }
}
