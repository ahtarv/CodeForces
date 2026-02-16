import java.util.*;

public class Problem_C_Contest_1080 {
    static final int INF = (int)1e9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // adjacency list for dice
        List<Integer>[] adj = new ArrayList[7];
        for (int i = 1; i <= 6; i++) adj[i] = new ArrayList<>();

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {
                if (i != j && i + j != 7) {
                    adj[i].add(j);
                }
            }
        }

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            int[][] dp = new int[n][7];

            // base case
            for (int v = 1; v <= 6; v++) {
                dp[0][v] = (a[0] == v ? 0 : 1);
            }

            // transitions
            for (int i = 1; i < n; i++) {
                for (int v = 1; v <= 6; v++) {
                    int best = INF;
                    for (int u : adj[v]) {
                        best = Math.min(best, dp[i - 1][u]);
                    }
                    dp[i][v] = best + (a[i] == v ? 0 : 1);
                }
            }

            int ans = INF;
            for (int v = 1; v <= 6; v++) {
                ans = Math.min(ans, dp[n - 1][v]);
            }

            System.out.println(ans);
        }
    }
}
