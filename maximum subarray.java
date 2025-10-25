class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int x:nums){
            if(currentSum<0){
                currentSum=x;
            }else{
                currentSum+=x;
            }
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
        } 
        return maxSum;  
    }
}
