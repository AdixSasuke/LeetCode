/*
 * @lc app=leetcode id=1431 lang=java
 *
 * [1431] Kids With the Greatest Number of Candies
 */

// @lc code=start

import java.util.*;

class Solution {
    static int getMax(int[] nums){
        int result = 0;
        for(int i: nums){
            if(i > result){
                result = i;
            }
        }
        return result;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maximum = getMax(candies);
        for(int j: candies){
            j = j + extraCandies;
            result.add((j >= maximum)?true:false);
        }
        return result;
    }
}
// @lc code=end

