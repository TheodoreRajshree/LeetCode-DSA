import java.util.Scanner;
class Solution {
    public int fib(int n) {
        int a =0;
        int b=1;
        for(int i=0;i<n;i++){
        int temp=a+b;
        b=a;
        a=temp;
        }
        return a;
    }

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Solution obj = new Solution();

        int result = obj.fib(n);

        System.out.println(result);
}
}