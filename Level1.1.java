class Solution {
    public int pivotIndex(int[] nums) {
       int[] arr=new int[nums.length];
        int lsum=0;
        int rsum=0;
        int ans=-1;
        for(int i=0;i<nums.length;i++){
            arr[i]=lsum;
            lsum+=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
           
            if(rsum==arr[i])ans=i;
            rsum+=nums[i];
        }

        return ans;
    }
}
