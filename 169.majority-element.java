/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {
        int majorityElement = nums.length / 2;
        for(int i: nums){
            int count = 0;
            for(int j: nums){
                if(i == j){
                    count++;
                }
            }
            if(count>majorityElement){
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

