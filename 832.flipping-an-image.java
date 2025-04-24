/*
 * @lc app=leetcode id=832 lang=java
 *
 * [832] Flipping an Image
 */

// @lc code=start
class Solution {
    public void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public void swapArray(int [] arr){
        for(int i = 0; i < arr.length; i++){
            if(i < arr.length-i){
                swap(arr[i], arr[arr.length-i]);
            }
        }
    }

    public int[][] flip(int [][] image){
        int [][] result = new int[image.length][];
        for(int i = 0; i < image.length; i++){
            swapArray(image[i]);
        }
        return result;
    }

    public int[][] flipAndInvertImage(int[][] image) {
        int [][] result;
        result = flip(image);
        return result;
    }
}
// @lc code=end

