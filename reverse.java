class Solution {
    public int reverse(int x) {
        int n =0;
        if(x<0){
            n=1;
        }
        int reverse=0;
        while(x!=0){
            int last = Math.abs(x)%10;
            if(reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && last > 7)){
                return 0;
            }
            if(reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && last < -8)){
                return 0;
            }
            reverse = reverse*10 +last;
            x /= 10;
        }
        if(n==1){
            return 0-reverse;
        }
        return reverse;
    }
}
