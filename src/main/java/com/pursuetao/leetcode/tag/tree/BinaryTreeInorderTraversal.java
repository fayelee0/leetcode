package com.pursuetao.leetcode.tag.tree;

import com.pursuetao.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// #94 中序遍历 LNR
public class BinaryTreeInorderTraversal {
    // 递归
    List<Integer> m0(TreeNode root) {
        List<Integer> ret;
        if (root != null) {
            ret = new ArrayList<>();

            ret.addAll(m0(root.getLeft()));
            ret.add(root.getVal());
            ret.addAll(m0(root.getRight()));
        } else {
            ret = Collections.emptyList();
        }

        return ret;
    }

    // 递归
    List<Integer> m1(TreeNode root) {
        List<Integer> ret = new ArrayList<>();

        if (root != null) {
            m11(root.getLeft(), ret);
            ret.add(root.getVal());
            m11(root.getRight(), ret);
        }

        return ret;
    }

    void m11(TreeNode root, List<Integer> ret) {
        if (root != null) {
            m11(root.getLeft(), ret);
            ret.add(root.getVal());
            m11(root.getRight(), ret);
        }
    }

    // 迭代
    List<Integer> m2(TreeNode root) {
        // TODO:
        return null;
    }
}
