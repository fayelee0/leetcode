package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestRemoveLinkedListElements {
    private RemoveLinkedListElements v;

    @Before
    public void setup() {
        v = new RemoveLinkedListElements();
    }

    @Test
    public void m0() {
        assertThat(v.m0(new ListNode(1, 2, 6, 3, 4, 5, 6), 6).sequence(), is(contains(1, 2, 3, 4, 5)));
        assertThat(v.m0(new ListNode(1, 1), 1), is(nullValue()));
    }

    @Test
    public void m1() {
        assertThat(v.m1(new ListNode(1, 2, 6, 3, 4, 5, 6), 6).sequence(), is(contains(1, 2, 3, 4, 5)));
        assertThat(v.m1(new ListNode(1, 1), 1), is(nullValue()));
    }
}
