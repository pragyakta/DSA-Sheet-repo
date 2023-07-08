//https://leetcode.com/problems/minimum-moves-to-equal-array-elements/

/*Given an integer array nums of size n, return the minimum number of moves required to make all array elements equal.
In one move, you can increment n - 1 elements of the array by 1.*/
/*Example 1:

Input: nums = [1,2,3]
Output: 3
Explanation: Only three moves are needed (remember each move increments two elements):
[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]*/


//here idea is not to increment smallest element, instead decrementing every element other that smallest one so that 
//it become equal to smallest one in possible minimum operation
/*ALGORITHM
 * Take the sum of array: [1,2,3]= 6
 * Sort the array and take the smallest element i.e., 1st element : 1
 * Formula for this: sum-(length of array * 1st element) [6-(3*1)] = 3
 */
 


import java.util.*;
class Solution {
    public int minMoves(int[] nums) {
       int sum = Arrays.stream(nums).sum();
       Arrays.sort(nums);
       int n = nums[0];
       int length = nums.length;
       int ans = sum - (length * n);
       return ans;
    }
}