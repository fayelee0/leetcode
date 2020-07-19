# [LeetCode](https://leetcode.com/problemset/all/)

## Tag

### [Tree](https://leetcode.com/tag/tree/)

#### [94. BinaryTree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)

1. Recursive

```java
binaryTreeInorderTraversal(root.left);
ret.add(root.val);
binaryTreeInorderTraversal(root.right);
```

2. Iterative

```java
Stack<TreeNode> stack = new Stack<>();
for (TreeNode node = root; node != null && !stack.isEmpty(); ) {
    while (node != null) {
        stack.push(node);
        node = node.left;
    }
    node = stack.pop();
    ret.add(node.val);
    node = node.right;
}
```

#### TODO [95. Unique Binary Search Trees II](https://leetcode.com/problems/unique-binary-search-trees-ii/)

#### TODO [96. Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees)

### [Array](https://leetcode.com/tag/array/)

### [1. Two Sum](https://leetcode.com/problems/two-sum/)

使用*散列*来存储*已遍历过的数*（值-索引）。
当前数通过查表来获取配对。

```java
Map<Integer, Integer> mm = new HashMap<>();
for (int i = 0, N = nums.length; i < N; i++) {
    if (mm.containsKey(target - nums[i])) {
        return new int[]{mm.get(target - nums[i]), i};
    } else {
        mm.put(nums[i], i);
    }
}
```