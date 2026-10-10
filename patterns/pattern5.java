import java.util.Scanner;
public class pattern5 {
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=0;i<n;i++)
    {

        for(int j=0;j<n-i+1;j++)// printing space
        {
        
        System.out.print(" ");
        }
        for(int j=0;j<2*i+1;j++)//printing star
        {
            System.out.print("*");
        }
        for(int j=0;j<n-i+1;j++)//printing space
        {
            System.out.print("");
        }
    
    System.out.println();
    }
    sc.close();
}

    
}
