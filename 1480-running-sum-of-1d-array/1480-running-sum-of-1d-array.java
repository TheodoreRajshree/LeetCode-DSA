class Solution {
    public int[] runningSum(int[] nums) {

        int a = nums[0];

        for(int i = 1; i < nums.length; i++) {

            int b = nums[i];

            int temp = a + b;

            nums[i] = temp;

            a = temp;
        }

        return nums;
    }
}