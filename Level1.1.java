class Solution {
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
       int max=0;
       int curr=1;
       for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1])curr++;
        else{
            max=Math.max(max,curr);
            curr=1;
        }
       }
       max=Math.max(max,curr);
        curr=1;
       int res=0;
      for(int i=1;i<nums.length;i++){
        if(nums[i]==nums[i-1])curr++;
        else if(max==curr){
           res+=max;
           curr=1;
        }
        else{
            curr=1;
        }
       }
       if(max==curr){
           res+=max;
           curr=1;
        }
        return res;
    }
}
