class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int x = (n * (n+1))/2;
        int y=0;
        for(int i=nums.length-1;i>=0;i--){
            y += nums[i];
        }
        return x-y;
    }
}
