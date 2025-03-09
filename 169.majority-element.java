/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */
// import java.util.Arrays;
// @lc code=start
class Solution {
    public int majorityElement(int[] nums) {

        //Brute Force
        // int majorityElement = nums.length / 2;
        // for(int i: nums){
        //     int count = 0;
        //     for(int j: nums){
        //         if(i == j){
        //             count++;
        //         }
        //     }
        //     if(count>majorityElement){
        //         return i;
        //     }
        // }
        // Insertion sort on nums array

        
        //Sorting
        // Arrays.sort(nums);
        // return nums[nums.length / 2];

        //Moore Voting Algorithm
        int candidate = 0;
        int count = 0;
        for(int num: nums){
            if(count == 0){
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        return candidate;
    }
}
// @lc code=end

