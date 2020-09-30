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

#### [23. Merge K Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists/)

> 将数据存入优先级队列
>
> 从优先级队列获取的结点就是最小结点，拼接到返回链表
>
> 将剩下的部分再次存入优先级队列
>
> 直到优先级队列为空

```java
class MergeKSortedLists {
    ListNode m0(ListNode[] lists) {
        int N = lists.length;
    
        if (N == 0) {
            return null;
        }
        
        if (N == 1) {
            return lists[0];
        }

        PriorityQueue<ListNode> pq = new PriorityQueue<>(Comparator.comparingInt(o -> o.val));
        for (ListNode node : lists) {
            pq.offer(node);
        }

        ListNode sentry = new ListNode(0);
        ListNode ptr = sentry;
        while (!pq.isEmpty()) {
            ptr.next = pq.poll();
            ptr = ptr.next;
        
            if (ptr.next != null) {
                pq.offer(ptr.next);
            }
        }
        return sentry.next;
    }
}
```

#### [24. Swap Nodes in Pairs](https://leetcode.com/problems/swap-nodes-in-pairs/)

1. Recursive

```java
class SwapNodesInPairs {
    ListNode m0(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode r = m0(head.next.next);
            ListNode s = head.next;
    
            head.next = r;
            s.next = head;
            return s;
        }
    }
}
```

2. Iterative

```java
class SwapNodesInPairs {
    ListNode m0(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode sentry = new ListNode(0, head);
            ListNode ptr = sentry;
            while (head != null && head.next != null) {
                ListNode cur = head;
                ptr.next = head.next;
                cur.next = head.next.next;
                ptr.next.next = cur;
                ptr = cur;
                
                head = ptr.next;
            }
            return sentry.next;
        }
    }
}
```

#### [61. Rotate List](https://leetcode.com/problems/rotate-list/)

> 计算链表长度
>
> 将通过快慢指针将链表分成两部分

```java
class RotateList {
    ListNode m0(ListNode head) {
        if(head!=null && head.next!=null) {
            ListNode fast = head;
                ListNode slow = head;
                
                int size = 0;
                while (fast.next != null) {
                    size++;
                    fast = fast.next;
                }
                size++;
        
                for (int i = size - k % size - 1; i > 0; i--) {
                    slow = slow.next;
                }
        
                fast.next = head;
                head = slow.next;
                slow.next = true;
        }
        return head;
    }
}
```

#### [82. Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)

> 如果发现相邻的元素相同，则依次跳过这些结点

1. Recursive

```java
class RemoveDuplicatesFromSortedListII {
    ListNode m0(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            if (head.val != head.next.val) {
                head.next = m0(head.next);
                return head;
            } else {
                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }
                return m0(head.next);
            }
        }
    }
}
```

2. Iterative

```java
class RemoveDuplicatesFromSortedListII {
    ListNode m0(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            ListNode sentry = new ListNode(0, head);

            ListNode ptr = sentry;
            ListNode x = head;
            while (x != null) {
                while (x.next != null && x.val == x.next.val) {
                    x = x.next;
                }
                
                if (ptr.next = x) {
                    ptr = ptr.next;
                } else {
                    ptr.next = x.next;
                }
        
                x = x.next;
            }
            ptr.next = null;
            return sentry.next;
        }
    }
}
```

#### [83. Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/)

> 快慢指针
>
> 快指针遍历所有元素，慢指针拼接所有不重复元素

```java
class RemoveDuplicatesFromSortedList {
    ListNode m0(ListNode head) {
        if (head != null && head.next != null) {
            ListNode ptr = head;
            for (ListNode x = head.next; x != null; x = x.next) {
                if (ptr.val != x.val) {
                    ptr.next = x;
                    ptr = ptr.next;
                }
            }
            ptr.next = null;    
        }
        return head;
    }   
}
```

#### [86. Partition List](https://leetcode.com/problems/partition-list/)

> 两个链表表示前后两段
>
> 两个指针表示链表的末尾

```java
class Partition {
    ListNode mo(ListNode head, int x) {
        ListNode rest = new ListNode(0);
        ListNode next = rest;
    
        ListNode temp = new ListNode(0);
        ListNode prev = temp;
    
        while (head != null) {
            if (head.val < x) {
                prev.next = head;
                prev = pre.next;
            } else {
                next.next = head;
                next = next.next;
            }
            head = head.next;
        }
    
        next.next = null;
        prev.next = rest.next;
        return temp.next;
    }
}
```

#### [92. Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii/)

> 保存前一段链表
>
> 反转 [m, n] 链表（注意结尾处 n = length）

```java
class ReverseLinkedListII {
    ListNode m0(ListNode head, int m, int n) {
        if (head == null || head.next == null || m == n) {
            return head;
        }

        ListNode ret = new ListNode(0, head);
    
        ListNode prev = ret;
        for (int i = 1; i < m; i++) {
            prev = prev.next;
        }
    
        ListNode next = prev.next;
        ListNode node;
        for (int i = m; i < n; i++) {
            node = next.next;
            next.next = node.next;
            node.next = prev.next;
            prev.next = node;
        }
        return ret.next; 
    }
}
```

### [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)

1. Iterative

```java
class RemoveLinkedListElements {
    ListNode m0(ListNode head, int val) {
        ListNode sentry = new ListNode(0, head);
        ListNode prev = sentry;
        ListNode node = prev.next;
        while (node != null) {
            if (node.val == val) {
                prev.next = node.next; 
            } else {
                prev = node;
            }
            node = prev.next;
        }
        return sentry.next;
    }
}
```

2. Recursive

```java
class RemoveLinkedListElements {
    ListNode m0(ListNode head, int val) {
        if (head == null) {
            return null;
        }

        if (head.val == val) {
            return m0(head.next, val);
        }
    
        head.next = m0(head.next, val);
        return head;
    }
}
```

### [876. Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)

> 快慢指针

```java
class MiddleOfTheLinkedList {
    ListNode m0(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.next;
    }
}
```

### [1290. Convert Binary Number in a Linked List to Integer](https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/)

```java
class ConvertBinaryNumberInALinkedListToInteger {
    int m0(ListNode head) {
        int ret = 0;
        while (head != null) {
            ret = ret * 2 + haed.val;
            head = head.next;
        }
        return ret;
    }
}
```