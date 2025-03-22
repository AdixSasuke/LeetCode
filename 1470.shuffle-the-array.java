/*
 * @lc app=leetcode id=1470 lang=java
 *
 * [1470] Shuffle the Array
 */

// @lc code=start
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        for(int i = 0; i < n; i++){
            result[i*2] = nums[i];
            result[i*2 + 1] = nums[n+i]; 
        }
        return result;
    }
}
// @lc code=end

