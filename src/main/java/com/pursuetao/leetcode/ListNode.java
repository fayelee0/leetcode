package com.pursuetao.leetcode;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int... values) {
        ListNode next = null;
        for (int i = values.length - 1; i > 0; i--) {
            next =  new ListNode(values[i], next);
        }
        this.val = values[0];
        this.next = next;
    }

    public List<Integer> sequence() {
        List<Integer> ret = new ArrayList<>();
        for (ListNode node = this; node != null; node = node.next) {
            ret.add(node.val);
        }
        return ret;
    }
}
