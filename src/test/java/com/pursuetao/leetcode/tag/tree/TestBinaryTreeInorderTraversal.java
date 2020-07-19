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

    @Test
    public void m2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertThat(vv.m2(root), contains(1, 3, 2));

        TreeNode node = new TreeNode(3, new TreeNode(1), new TreeNode(2));
        assertThat(vv.m2(node), contains(1, 3, 2));
    }

    @Test
    public void m3() {
        TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));
        assertThat(vv.m3(root), contains(1, 3, 2));

        TreeNode node = new TreeNode(3, new TreeNode(1), new TreeNode(2));
        assertThat(vv.m3(node), contains(1, 3, 2));
    }
}
