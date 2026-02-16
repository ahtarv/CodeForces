import java.util.*;

public class Problem_A_Contest_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            boolean found = false;

            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if (x == 67) {
                    found = true;
                }
            }

            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
