import java.util.*;

public class Problem_B_Contest_1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int left = arr[0];
            int right = arr[n - 1];

            if (left == -1 && right == -1) {
                left = 0;
                right = 0;
            } else if (left == -1) {
                left = right;
            } else if (right == -1) {
                right = left;
            }

            arr[0] = left;
            arr[n - 1] = right;

            System.out.println(Math.abs(right - left));

            for (int i = 1; i < n - 1; i++) {
                if (arr[i] == -1) {
                    arr[i] = arr[i - 1];
                }
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
