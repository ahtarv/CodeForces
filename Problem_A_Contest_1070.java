import java.util.*;

public class Problem_A_Contest_1070 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int min = Integer.MAX_VALUE;
            int keep = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x <= min) {
                    min = x;
                    keep++; // prefix minimum
                }
            }

            System.out.println(n - keep);
        }
        sc.close();
    }
}
