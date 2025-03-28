/*
 * @lc app=leetcode id=1389 lang=java
 *
 * [1389] Create Target Array in the Given Order
 */

// @lc code=start
import java.util.*;

class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        int [] result = new int [nums.length];
        
        for(int i = 0; i < nums.length; i++){
            list.add(index[i], nums[i]);
        }
        
        for(int i = 0; i < nums.length; i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
// @lc code=end

