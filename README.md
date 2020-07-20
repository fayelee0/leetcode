# [LeetCode](https://leetcode.com/problemset/all/)

## Tag

### [Tree](https://leetcode.com/tag/tree/)

#### [94. BinaryTree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)

1. Recursive

```java
class BinaryTreeInorderTraversal {
    List<Integer> m0(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        ret.addAll(binaryTreeInorderTraversal(root.left));
        ret.add(root.val);
        ret.addAll(binaryTreeInorderTraversal(root.right));
        return ret;
    }
}

```

2. Iterative

```java
class BinaryTreeInorderTraversal {
    List<Integer> m0(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
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
        return ret;
    }
}
```

#### TODO [95. Unique Binary Search Trees II](https://leetcode.com/problems/unique-binary-search-trees-ii/)

#### TODO [96. Unique Binary Search Trees](https://leetcode.com/problems/unique-binary-search-trees)

### [Array](https://leetcode.com/tag/array/)

### [1. Two Sum](https://leetcode.com/problems/two-sum/)

使用*散列*来存储*已遍历过的数*（值-索引）。
当前数通过查表来获取配对。

```java
class TwoSum() {
    int[] m0(int[] nums, int target) {
        Map<Integer, Integer> mm = new HashMap<>();
        for (int i = 0, N = nums.length; i < N; i++) {
            if (mm.containsKey(target - nums[i])) {
                return new int[]{mm.get(target - nums[i]), i};
            } else {
                mm.put(nums[i], i);
            }
        }
        return null;
    }
}
```

### [15. 3Sum](https://leetcode.com/problems/3sum/)

1. 排序数组
2. 取数做锚点，然后 [lo, hi] 两个指针向中间扫描

```java
class ThreeSum {
    List<List<Integer>> m0(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < N - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) { // 前面相同的数已经处理过，该重复的数就不处理了
                int sum = -nums[i];
                int lo = i + 1;
                int hi = N - 1;

                while (lo < hi) {
                    if (sum == nums[lo] + nums[hi]) {
                        ret.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while (lo < hi && nums[lo] == nums[lo + 1]) { // 跳过重复数
                            lo++;
                        }
                        while (lo < hi && nums[hi] == nums[hi - 1]) { // 跳过重复数
                            hi--;
                        }
                    } else if (sum > nums[lo] + nums[hi]) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return ret;
    }
}
```