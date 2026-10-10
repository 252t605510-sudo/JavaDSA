
import java.util.Scanner;
public class pattern17 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<n-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            space=space+2;
        }
        int spaces=2*(n-1);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<spaces;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
            spaces=spaces-2;
        }
        sc.close();
    }
    
}
