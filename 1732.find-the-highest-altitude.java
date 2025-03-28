/*
 * @lc app=leetcode id=1732 lang=java
 *
 * [1732] Find the Highest Altitude
 */

// @lc code=start
class Solution {
    public int largestAltitude(int[] gain) {
        int result = 0, sum = 0;
        for(int i = 0; i < gain.length; i++){
            sum += gain[i];
            if(sum > result){
                result = sum;
            }
        }
        return result;
    }
}
// @lc code=end

