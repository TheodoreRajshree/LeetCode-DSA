import java.util.Scanner;
class Solution {
    public int reverse(int x) {
    long rev=0;
    while(x!=0){
        int digit=x;
        rev=rev*10 + x %10;
        x/=10;

    }
    if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
        return 0;
    }
    return (int)rev;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Solution obj=new Solution();
        int a=obj.reverse(x);
        System.out.println(a);
    }
}