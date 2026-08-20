class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0) return 0;

        int num=1; int max=1;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]-1) {
            num++;
            max=Math.max(num,max);
            }
            else if(nums[i]==nums[i+1]) continue;
            else num=1;
        }
        return max;
    }
}
