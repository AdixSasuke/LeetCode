/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(hasEvenDigits(nums[i])){
                result++;
            }
        }
        return result;
    }
    
    // public boolean hasEvenDigits(int num){
    //     boolean result = false;
    //     int count = 0;
    //     while(num > 0){
    //         count++;
    //         num = num/10;
    //     }
    //     if(count % 2 == 0){
    //         result = true;
    //     }
    //     return result;
    // }

        public boolean hasEvenDigits(int num){
        boolean result = false;
        int count = (int) Math.log10(num) + 1;
        if(count % 2 == 0){
            result = true;
        }
        return result;
    }
}
// @lc code=end

