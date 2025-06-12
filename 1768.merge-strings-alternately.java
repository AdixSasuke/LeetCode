/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int m = word1.length();
        int n = word2.length();
        for(int i = 0; i < m + n; i++){
            if(i < m){
                sb.append(word1.charAt(i));
            }
            if(i < n){
                sb.append(word2.charAt(i));
            }
        }

        return sb.toString();
    }
}
// @lc code=end

