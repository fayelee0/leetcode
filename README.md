# [LeetCode](https://leetcode.com/problemset/all/)

## Tag

> 仅保留关键代码

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

#### [1. Two Sum](https://leetcode.com/problems/two-sum/)

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

#### [15. 3Sum](https://leetcode.com/problems/3sum/)

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

### [Linked List](https://leetcode.com/tag/linked-list/)

#### [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

> 注意进位

```java
class AddTwoNumbers {
    ListNode m0(ListNode l1, ListNode l2) {
        ListNode sentry = new ListNode(0);
    
        ListNode node = sentry;
        int c = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                c += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                c += l2.val;
                l2 = l2.next;
            }
            node.next = new ListNode(c % 10);
            node = node.next;
            c /= 10;
        }
    
        if (c != 0) {
            node.next = new ListNode(c);
        }
    
        return sentry.next;
    }
}
```

#### [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

> 通过*快慢指针*将间距拉开*N*

```java
class RemoveNthNodeFromEndOfList {
    ListNode m0(ListNode head, int n) {
        ListNode sentry = new ListNode(0, head);
        ListNode slow = sentry;
        ListNode fast = sentry;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return sentry.next;
    }
}
```

#### [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)

1. Recursive

```java
class MergeTwoSortedLists {
    ListNode m0(ListNodo l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else {
            if (l1.val < l2.val) {
                l1.next = m0(l1.next, l2);
                return l1; 
            } else {
                l2.next = m0(l1, l2.next);
                return l2;
            }
        }
    }
}
```

2. Iterative

```java
class MergeTwoSortedLists {
    ListNode m0(ListNode l1, ListNode l2) {
        ListNode sentry = new ListNode(0);
        ListNode x = sentry;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                x.next = l1;
                l1 = l1.next;
            } else {
                x.next = l2;
                l2 = l2.next;
            }
            x = x.next;
        }
    
        if (l1 != null) {
            x.next = l1;
        } else {
            x.next = l2;
        }
        
        return sentry.next;
    }
}
```