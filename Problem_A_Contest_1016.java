import java.util.*;
public class Problem_A_Contest_1016{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int num = sc.nextInt();
            if(num%2 == 0){
                System.out.println("NO");
            }   
            else{
                System.out.println("YES");
            }
        }
    }

}