public class Solution {
    public static void numberCrown(int N) {
        // Write your code here.
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int k = 1; k <= 4 * (N - i); k++) {
                System.out.print(" ");
            }
            for (int l = i; l > 0; l--) {
                if (l != N) {
                    System.out.print(l + " ");
                } else {
                    System.out.print(l+" ");
                }
            }
            System.out.println();
        }
    }
}
