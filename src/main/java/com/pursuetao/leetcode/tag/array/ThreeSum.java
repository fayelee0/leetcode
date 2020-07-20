package com.pursuetao.leetcode.tag.array;

import java.util.*;

public class ThreeSum {
    // Time     O(n^2)
    // Space    O(1) or O(n) as Sort Algorithm
    List<List<Integer>> m0(int[] nums) {
        int N = nums.length;
        if (N < 3) {
            return Collections.emptyList();
        }

        Arrays.sort(nums); // QuickSort O(n lg n) O(1)

        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < N - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int lo = i + 1;
                int hi = N - 1;

                int sum = -nums[i];
                while (lo < hi) {
                    if (sum == nums[lo] + nums[hi]) {
                        ret.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                        while (lo < hi && nums[lo] == nums[lo + 1]) {
                            lo++;
                        }

                        while (lo < hi && nums[hi] == nums[hi - 1]) {
                            hi--;
                        }

                        lo++;
                        hi--;
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
