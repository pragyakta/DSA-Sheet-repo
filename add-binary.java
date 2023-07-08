//https://leetcode.com/problems/add-binary/
/*Given two binary strings a and b, return their sum as a binary string.

 Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101" */
/*ALGORITHM
 * Two variable with the length of either strings given
 * start a loop, every time initializing sum with carry i.e., 0 at first.
 * check those two variables are not decremented less than 0
 * add numeric value of character at the position of those two variable seperately.
 * sum can have three value : 0:[0+0] || 1:[0+1,1+0] || 2:[1+1] 
 * inserting value at first position everytime sum%2:a/q-> 0%2=0 || 1%2=1 || 2%2=0
 * now for carry we put value sum/2:a/q-> 0/2=0 ||  1/2 = 0 || 2/2=0
 * at last decrementing those two variable by 1.
 */

class Solution {
  public String addBinary(String a, String b) {
      int carry=0;
      int n1 = a.length()-1;
      int n2 = b.length()-1; 
      StringBuilder str = new StringBuilder();
        
      while(n1>=0 || n2>=0){
        int sum = carry;
        if(n1>=0){
          sum += a.charAt(n1) -'0';
        }
        if(n2>=0){
          sum += b.charAt(n2) -'0';
        }
        str.insert(0,sum%2);
        carry = sum/2;
        n1--;
        n2--;
      }
      
      if(carry>0){
        str.insert(0,carry);
      }
    return str.toString();    
  }
}
