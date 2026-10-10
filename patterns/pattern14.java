import java.util.Scanner;
public class pattern14 {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int ch= i+'A';
            for(int j=0;j<=i;j++)
            {
              System.out.print((char)ch+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}

