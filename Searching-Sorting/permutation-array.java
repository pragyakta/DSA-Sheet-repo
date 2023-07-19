/*Given two arrays of equal size N and an integer K.
 The task is to check if after permuting both arrays, we get sum of their 
 corresponding element greater than or equal to k i.e Ai + Bi >= K 
 for all i (from 0 to N-1). Return true if possible, else false.*/


import java.util.*;
class Solution {
    public boolean isPossible(long a[], long b[], int n, long k) {
        Arrays.sort(a);//sorting both arrays.
         Arrays.sort(b);
  
        for(int i=0;i<n;i++){
            long sum = a[i]+b[n-i-1];//first element of a array and last element of b array.
            if(sum < k){
                return false; //if any combination of element is less than k return false 
            }
        }
        return true; // if all combition is greater or equal to k then return true
        
    }
}
