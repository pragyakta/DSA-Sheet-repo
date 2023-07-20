/* finding a subarray that will be reversed thus making array sorted */
/*ALGORITHM
 * array will be in three part, 
 * first will be in increasing order, second will be decreasing order and third will again increasing order.
 * interate till current element is less than next one, then check if you are the end of array, return true.\
 * now from previous point start iterating, check current position is greater than previous one. also everytime check 
 * current position is greater than first part end point, return false.
 * same with third part.
 */
class Solution{
    static boolean reverse(int[] arr, int n){
        if(n==1){
            return true;
        }
        //increasing first part
        int i;
        for(i=1;arr[i]>arr[i-1] && i<n;i++);
        if(i==n){
            return true;
        }
        //decreasing second part
        int j=i;
        while(j<n && arr[j]>arr[j-1]){
            if(i>1 && arr[j] > arr[i-1]){
                return false;
            }
            j++;
        }
        if(j==n){
            return true;
        }
        //third part which is aleady sorted
        int k=j;
        if(arr[k]<arr[i-1]){
            return false;
        }
        while(k>1 && k<n){
            if(arr[k]<arr[k-1]){
                return false;
            }
            k++;
        }
        return false;
    }
}
