public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        int l=1;
        for (int i=0;i<=n;i++)
        {
            for (int j=0;j<i;j++){
                System.out.print(l+" ");
                l++;
            }
            System.out.println();
        }
    }
}
