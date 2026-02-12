import java.util.*;

public class Problem_B_Contest_1016{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            String s = sc.next();
            int zeros = 0;
            int best = 0;

            for(int i=0;i<s.length();i++)
            {
                char c = s.charAt(i);
                if(c == '0'){
                    zeros++;
                }
                else{
                    best = Math.max(best, zeros+1);
                }
            }

            System.out.println(s.length() - best);
        }
    }
}