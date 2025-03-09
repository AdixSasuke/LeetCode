/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int res = 0;
        int sign = 1;


        if(x < 0){
            sign = -1;
            res = sign * res;
        }

        while(x != 0){
            res = res * 10 + x % 10;
            x /= 10;
        }
        
        if(sign == -1){
            res = sign * res;
        }
        return res;
    }
}
// @lc code=end

