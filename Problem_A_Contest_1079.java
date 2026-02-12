import java.util.*;

public class Problem_A_Contest_1079 {

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int count = 0;

            for (int y = x; y <= x + 90; y++) {
                if (y - digitSum(y) == x) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
