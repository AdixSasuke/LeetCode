/*
 * @lc app=leetcode id=1929 lang=java
 *
 * [1929] Concatenation of Array
 */

// @lc code=start
class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] result = new int [2 * nums.length];
        for(int i = 0; i <2*nums.length; i++){
            result[i] = nums[i % nums.length];
        }
        return result;
    }
}


// @lc code=end

