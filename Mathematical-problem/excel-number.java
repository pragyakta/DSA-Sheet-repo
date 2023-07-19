/*Excel Sheet Column Title
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...*/
/*ALGORITHM
 * columnNumber % 26 is zero it means one cycle from A to Z completed.So, Z is added.
 * one cycle is completed so columnNumber is decremented by 1. 
 * if columnNumber is not zero then whatever the number is, according to alphabet position, same alphabet is added.
 * and by dividing columnNumber by 26, remove one cycle from it whether it is full circle or not.
*/
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder str =  new StringBuilder();
        while(columnNumber>0){
            int rem = columnNumber % 26;
            if(rem == 0){
                str.append('Z');
                columnNumber--;
            }
            else{
                str.append((char)(rem + 'A' - 1));
            }
            columnNumber /= 26;
        }
        return str.reverse().toString();
    }
}
