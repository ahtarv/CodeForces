import java.util.*;

public class Problem_A_Contest_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            if (n % 2 != 0) {
                System.out.println(0);
            } else {
                System.out.println((n / 4) + 1);
            }
        }

        sc.close();
    }
}
