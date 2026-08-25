class Solution {
    public boolean searchMatrix(int[][] nums, int target) {
        int i=0; int j=nums[0].length-1;
        while(i<nums.length && j>=0){
            if (target < nums[i][j]) j--;
            else if(nums[i][j]<target) i++;
            else return true;
        }
        return false;
    }
}
