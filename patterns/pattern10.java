import java.util.Scanner;
public class pattern10 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=2*(n-1);
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)//printing numbers
            {
                System.out.print(j);
            }
            for(int j=1;j<=space;j++)//printing space
            {
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--)//printing numbers
            {
                System.out.print(j);
            }
            System.out.println();
            space=space-2;
        }
        sc.close();
    }
    
}
