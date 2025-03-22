/*
 * @lc app=leetcode id=1920 lang=java
 *
 * [1920] Build Array from Permutation
 */

// @lc code=start
class Solution {
    public int[] buildArray(int[] nums) {
        int [] result = new int [nums.length]; 
        for(int i = 0; i < nums.length; i++){
            result[i] = nums[nums[i]];
        }
        return result;        
    }
}
// @lc code=end

