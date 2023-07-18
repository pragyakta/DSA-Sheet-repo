/*Happy Number
Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:
1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
3. Those numbers for which this process ends in 1 are happy.
4. Return true if n is a happy number, and false if not. */

/*ALGORITHM
 * simple algorithm called the "Floyd's Cycle Detection Algorithm" used here.
 * there is two variable defined one is slow and other is fast, fast calculates the sum of square two times and slow only one.
 * sum of square of every digit is calculated while fast is not equal to slow or 1.
 */
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = calculateSumOfSquares(slow);
            fast = calculateSumOfSquares(calculateSumOfSquares(fast));
        } 
        while (slow != fast);

        return slow == 1;
    }
    private static int calculateSumOfSquares(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}
