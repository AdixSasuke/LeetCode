/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        if(temp % 10 == 0 && x < 10 && x < -10){
            return true;
        }
        while(temp > 0){
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        if(x == rev){
            return true;
        }
        return false;
    }
}
// @lc code=end

