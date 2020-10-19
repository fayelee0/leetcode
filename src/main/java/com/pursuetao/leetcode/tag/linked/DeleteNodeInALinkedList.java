package com.pursuetao.leetcode.tag.linked;

import com.pursuetao.leetcode.ListNode;

// 条件：给定的结点不会是最末结点
public class DeleteNodeInALinkedList {
    // 从链表中移除一个结点，还不知道前序的情况下
    // 可以把数据和指针前置，并移除最末结点
    //
    // Time     O(n)
    // Space    O(1)
    void m0(ListNode node) {
        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }

    // 将当前结点与后续结点合并成一个结点来使用
    // 其中数据是后续结点的数据
    //     指针指向后续的后续
    //
    // Time     O(1)
    // Space    O(1)
    void m1(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
