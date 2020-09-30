package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class TestConvertBinaryNumberInALinkedListToInteger {
    private ConvertBinaryNumberInALinkedListToInteger v;

    @Before
    public void setup() {
        v = new ConvertBinaryNumberInALinkedListToInteger();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(1, 0, 1)), is(5));
        assertThat(v.m0(new ListNode(0)), is(0));
        assertThat(v.m0(new ListNode(1)), is(1));
        assertThat(v.m0(new ListNode(1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0)), is(18880));
        assertThat(v.m0(new ListNode(0, 0)), is(0));
    }
}
