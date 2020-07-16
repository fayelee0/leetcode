package com.pursuetao.leetcode.tag.tree;

import com.pursuetao.leetcode.TreeNode;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;

public class TestBinaryTreeInorderTraversal {
    BinaryTreeInorderTraversal vv;

    @Before
    public void setUp() {
        vv = new BinaryTreeInorderTraversal();
    }

    @Test
    public void m0() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertThat(vv.m0(root), contains(1, 3, 2));
    }

    @Test
    public void m1() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertThat(vv.m1(root), contains(1, 3, 2));
    }
}
