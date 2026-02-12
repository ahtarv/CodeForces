import java.util.*;
public class Problem_C_Contest_1016{
    static boolean isPrime(int n){
        if(n<=1) return false;
        if(n<= 3) return true;
        if(n%2 ==0 || n%3==0) return false;

        for(int i=5;i*i<=n;i+=6)
        {
            if(n%i == 0 || n%(i+2) == 0)
            {
                return false;
            }
        }   
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int x = sc.nextInt();
            int k = sc.nextInt();
            
            if(x==1 && k==2)
            {
                System.out.println("YES");
            }            
            else if (k==1 && isPrime(x)){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }
}