package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeLinkedList {
    // 存储到动态数组中，然后计算
    //
    // Time     O(n)
    // Space    O(n)
    boolean m0(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        List<ListNode> s = new ArrayList<>();
        for (ListNode x = head; x != null; x = x.next) {
            s.add(x);
        }

        int N = s.size();
        for (int i = 0; i < N / 2; i++) {
            if (s.get(i).val != s.get(N - 1 - i).val) {
                return false;
            }
        }
        return true;
    }

    // 用一个栈来存放前半段的数据，然后比较
    //
    // 1 -> 2 -> 2 -> 1
    // 1 -> 2 -> 3 -> 2 -> 1
    //
    // (0, 0) (1, 2) (2, 4) (3, 6) (4, 8) (5, 10)
    //
    // Time     O(n)
    // Space    O(n)
    boolean m1(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        Stack<ListNode> m = new Stack<>();
        ListNode s = head;
        ListNode f = head;
        while (f != null && f.next != null) {
            m.add(s);

            s = s.next;
            f = f.next.next;
        }

        if (f != null) {    // 奇数
            s = s.next;
        }

        while (!m.empty()) {
            if (m.pop().val != s.val) {
                return false;
            } else {
                s = s.next;
            }
        }
        return true;
    }

    // 快慢指针，将链表拆分成两个部分，同时前半部分反转链表
    //
    // Time     O(n)
    // Space    O(1)
    boolean m2(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }

        ListNode s = head;
        ListNode f = head;
        ListNode t;
        ListNode x = null;
        while (f != null && f.next != null) {
            t = s;
            s = s.next;
            f = f.next.next;

            t.next = x;
            x = t;
        }

        if (f != null) {
            s = s.next;
        }

        while (s != null) {
            if (s.val != x.val) {
                return false;
            }
            s = s.next;
            x = x.next;
        }
        return true;
    }
}
