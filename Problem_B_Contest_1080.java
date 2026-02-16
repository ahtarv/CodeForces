import java.util.*;

public class Problem_B_Problem_1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean[] visited = new boolean[n];
            boolean ok = true;

            for (int i = 0; i < n && ok; i++) {
                if (visited[i]) continue;

                ArrayList<Integer> cur = new ArrayList<>();
                ArrayList<Integer> need = new ArrayList<>();

                int idx = i;
                while (idx < n) {
                    visited[idx] = true;
                    cur.add(arr[idx]);
                    need.add(idx + 1);
                    idx = 2 * idx + 1;
                }

                Collections.sort(cur);
                Collections.sort(need);

                if (!cur.equals(need)) {
                    ok = false;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }

        sc.close();
    }
}
