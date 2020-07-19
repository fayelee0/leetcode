package com.pursuetao.leetcode.tag.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    int[] m0(int[] nums, int target) {
        Map<Integer, Integer> mm = new HashMap<>();
        for (int i = 0, N = nums.length; i < N; i++) {
            if (mm.containsKey(target - nums[i])) {
                return new int[]{i, mm.get(target - nums[i])};
            } else {
                mm.put(nums[i], i);
            }
        }
        return null;
    }
}
