/*
 * @lc app=leetcode id=246 lang=java
 *
    * [246] Strobogrammatic Number
 */

// @lc code=start
class Solution {
    public boolean verify(int n){
        int [] correct = new int[] {0, 1, 6, 8, 9};
        while(n%10 == 0){
            int temp = n % 10;
            n = n / 10;
            for(int i : correct){
                if(temp == i){
                    
                }
            }
        }
        return false;
    }

    public boolean isStrobogrammatic(String num) {
        int n = Integer.parseInt(num);
        boolean res = verify(n);
        System.out.println(res);
        return false;
    }
}
// @lc code=end

