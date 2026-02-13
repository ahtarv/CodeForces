import java.util.*;

public class Problem_B_Contest_1079 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int test = 0; test < t; test++) {

            int length = sc.nextInt();
            int[] arr = new int[length];
            int[] secarr = new int[length];

            for (int j = 0; j < length; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j < length; j++) {
                secarr[j] = sc.nextInt();
            }
            int[] pos = new int[length + 1];
for (int i = 0; i < length; i++) {
    pos[arr[i]] = i;
}

int[] left = new int[length + 1];
int[] right = new int[length + 1];

Arrays.fill(left, length);
Arrays.fill(right, -1);

for (int i = 0; i < length; i++) {
    int v = secarr[i];
    left[v] = Math.min(left[v], i);
    right[v] = Math.max(right[v], i);
}

boolean ok = true;

for (int x = 1; x <= length; x++) {
    if (right[x] == -1) continue;

    if (pos[x] < left[x] || pos[x] > right[x]) {
        ok = false;
        break;
    }

    for (int i = left[x]; i <= right[x]; i++) {
        if (secarr[i] != x) {
            ok = false;
            break;
        }
    }

    if (!ok) break;
}

System.out.println(ok ? "YES" : "NO");


        }

        sc.close();
    }
}
