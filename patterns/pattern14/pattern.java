public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
         
        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<i;j++){
                System.out.print((char)(j+65)+" ");
                
            }
            System.out.println();
        }
    }
}
