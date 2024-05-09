public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        int t=1,init=1;
        for(int i=1;i<=n;i++){
       t=init;
        for(int j=0;j<i;j++){

            System.out.print(t+" ");
            if(t==1)t=0;
            else t=1;
        }
        if(init==1)init=0;
            else init=1;
        System.out.println();
        }
    }
}
