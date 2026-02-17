import java.util.*;
public class Problem_A_Round_611{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t;i++)
        {
            int h = sc.nextInt();
            int m = sc.nextInt();
            int k1 = 24-h;
            int k2 = 60 - m;
            k1 *=60;
            System.out.println(k1+k2);

        }
    }
}