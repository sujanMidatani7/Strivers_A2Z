public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
         for(int i=1;i<=n;i++){
        for(int j=0;j<n-i+1;j++)System.out.printf(j+1+" ");
        System.out.println();
        }
    }
}
