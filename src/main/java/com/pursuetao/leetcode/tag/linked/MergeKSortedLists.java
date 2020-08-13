package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeKSortedLists {
    // 从头开始两两合并
    //
    // Time     O(N) n = n * m
    // Space    O(1)
    ListNode m0(ListNode[] lists) {
        int N = lists.length;

        if (N == 0 ) {
            return null;
        } else if (N == 1) {
            return lists[0];
        } else {
            ListNode ret = lists[0];
            for (int i = 1; i < N; i++) {
                ret = merge(ret, lists[i]);
            }
            return ret;
        }
    }

    ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode ret = new ListNode(0);
        ListNode ptr = ret;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ptr.next = l1;
                l1 = l1.next;
            } else {
                ptr.next = l2;
                l2 = l2.next;
            }
            ptr = ptr.next;
        }

        if (l1 != null) {
            ptr.next = l1;
        } else {
            ptr.next = l2;
        }

        return ret.next;
    }

    // 使用优先级队列，将所有的链表存入队列。
    // 从队列中取出链表。
    //     1. 将第一个元素拼入返回链表。
    //     2. 将剩余部分存入队列。
    //
    // Time     O(n log n + mn 2log n) ~ O(n log n)
    // Space    O(n)
    ListNode m1(ListNode[] lists) {
        int N = lists.length;

        if (N == 0) {
            return null;
        }

        if (N == 1) {
            return lists[0];
        }

        PriorityQueue<ListNode> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));

        for (ListNode node : lists) {   // O(n)
            if (node != null) {
                priorityQueue.offer(node);  // O(log n)
            }
        }


        ListNode sentry = new ListNode(0);
        ListNode ptr = sentry;
        while (!priorityQueue.isEmpty()) { // O(mn)
            ptr.next = priorityQueue.poll();    // O(log n)
            ptr = ptr.next;

            if (ptr.next != null) {
                priorityQueue.offer(ptr.next);  // O(log n)
            }
        }
        return sentry.next;
    }
}
