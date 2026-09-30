public class Solution{
    
        public int[] shuffle(int[] num, int n){
        int[]arr=new int[num.length];
        for(int i=0;i<num.length;i++){
        if(i%2==0){
            arr[i]=num[i/2];
        }
        else{
            arr[i]=num[n+i/2];
        }
        }
        return arr;
        }
    }