/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // int [] res = new int [2];
        // for(int i = 0; i < nums.length; i++){
        //     for(int j = i + 1; j < nums.length; j++){
        //         if(nums[i]+nums[j] == target){
        //             res = new int[] {i, j};
        //             return res;
        //         }
        //     }
        // }
        // return null;

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            //targer = curr + x
            //x = target - curr
            int x = target - curr;
            if(map.containsKey(x)){
                return new int[] {map.get(x), i};
            }
            map.put(curr, i);
        }
        return null;
    }
}
// @lc code=end

