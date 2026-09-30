import java.util.Scanner;

class Solution {

    public int[] twoSum(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] num = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Solution obj = new Solution();

        int[] result = obj.twoSum(num, target);

        System.out.println(result[0] + " " + result[1]);
    }
}