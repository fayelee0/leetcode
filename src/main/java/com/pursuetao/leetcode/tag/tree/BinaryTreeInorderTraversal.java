package com.pursuetao.leetcode.tag.tree;

import com.pursuetao.leetcode.TreeNode;

import java.util.*;

// #94 中序遍历 LNR
public class BinaryTreeInorderTraversal {
    // 递归：每一个分支都需要构建 ArrayList 对象
    //
    // 时间：O(2^n), n = 树的高度
    // 空间：O(n)，  n = 树的结点数
    List<Integer> m0(TreeNode root) {
        List<Integer> ret;
        if (root != null) {
            ret = new ArrayList<>();

            ret.addAll(m0(root.left));
            ret.add(root.val);
            ret.addAll(m0(root.right));
        } else {
            ret = Collections.emptyList();
        }

        return ret;
    }

    // 递归：传递一个公用的 ArrayList 对象
    //
    // 时间：O(2^n)，n = 树的高度
    // 空间：O(n)，  n = 树的结点数
    List<Integer> m1(TreeNode root) {
        List<Integer> ret = new ArrayList<>();

        if (root != null) {
            m11(root.left, ret);
            ret.add(root.val);
            m11(root.right, ret);
        }

        return ret;
    }

    void m11(TreeNode root, List<Integer> ret) {
        if (root != null) {
            m11(root.left, ret);
            ret.add(root.val);
            m11(root.right, ret);
        }
    }

    // 迭代
    //
    // 时间：O(n)，n = 树的结点数
    // 空间：O(n)，n = 树的结点数
    List<Integer> m2(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);

        Set<TreeNode> set = new HashSet<>();

        List<Integer> ret = new ArrayList<>();
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();

            if (!set.contains(node)) {
                if (node.right != null) {
                    stack.push(node.right);
                }

                if (node.left == null || set.contains(node.left)) {
                    ret.add(node.val);
                    set.add(node);
                } else {
                    stack.push(node);
                    if (node.left != null) {
                        stack.push(node.left);
                    }
                }
            }
        }
        return ret;
    }


    // 迭代：
    List<Integer> m3(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        for (TreeNode node = root; node != null || !stack.isEmpty(); ) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            ret.add(node.val);
            node = node.right;
        }
        return ret;
    }
}
