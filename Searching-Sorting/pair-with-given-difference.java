import java.util.*;
class Solution
{
    public boolean findPair(int arr[], int size, int n)
    {
        HashSet<Integer> set= new HashSet<>();
        for(int num: arr){
            if(set.contains(num-n) || set.contains(num+n)){
                return true;
            }
            set.add(num);
        }
       
       return false;
    }
}
