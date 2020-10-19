package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedList {
    // 暴力破解
    // A 中的每一个结点，都在 B 中查找
    //
    // Time     O(m + n)
    // Space    O(1)
    ListNode m0(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        for (ListNode x = headA; x != null; x = x.next) {
            for (ListNode y = headB; y != null; y = y.next) {
                if (x == y) {
                    return x;
                }
            }
        }
        return null;
    }

    // Hash
    // A 中的每一个结点都存储到 Hash 中，遍历 B 中的所有结点
    //
    // Time     O(m + n)
    // Space    O(m or n)
    ListNode m1(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Set<ListNode> set = new HashSet<>();
        for (ListNode x = headA; x != null; x = x.next) {
            set.add(x);
        }
        for (ListNode y = headB; y != null; y = y.next) {
            if (set.contains(y)) {
                return y;
            }
        }
        return null;
    }

    // Two-Pointer
    //
    // A:   4 1 8 4 5
    // B: 5 6 1 8 4 5
    //
    // A-: 4 1 8 4 5 5 6 1 8 4 5
    // B-: 5 6 1 8 4 5 4 1 8 4 5
    //
    // Time     O(m + n)
    // Space    O(1)
    ListNode m2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode x = headA;
        ListNode y = headB;
        while (x != y) {
            x = (x == null) ? headB : x.next;
            y = (y == null) ? headA : y.next;
        }
        return x;
    }
}
