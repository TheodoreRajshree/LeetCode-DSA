import java.util.Scanner;
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int a=nums[0];
        for(int i=1;i<n;i++){
            int b=nums[i];
            int temp=a+b;
            b=a;
            nums[i]=temp;
            a=temp;
        }
        return nums;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        Solution obj=new Solution();
        int []res=obj.runningSum(nums);
        for(int i=0;i<nums.length;i++){
              System.out.println(res[i]);
        }
    }
}