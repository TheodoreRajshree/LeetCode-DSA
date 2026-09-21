import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int original=x;
        if(x<0){
            return false;
        }
        while(x !=0){
            int digit=x;
            rev=rev *10 + x % 10;
            x/=10;
        }
        if(original==rev){
         return true;
        }
         else {
            return false;
        }
    }
    public static void main(String[]args){

    
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    Solution obj=new Solution();
    boolean a=obj.isPalindrome(x);
    System.out.println(a);
}
}