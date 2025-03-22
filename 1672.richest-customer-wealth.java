/*
 * @lc app=leetcode id=1672 lang=java
 *
 * [1672] Richest Customer Wealth
 */

// @lc code=start
class Solution {
    public int maximumWealth(int[][] accounts) {
        int result = 0;
        for(int[] i: accounts){
            int sum = 0;
            for(int j: i){
                sum = sum + j;
            }
            if(sum > result){
                result = sum;
            }
        }
        return result;
    }
}
// @lc code=end

