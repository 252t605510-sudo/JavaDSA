import java.util.Scanner;
public class ForLoop
{
    public static void main(String[]args)
    {
       Scanner in=new Scanner(System.in);
        System.out.print("enter the number:");
       int num =in.nextInt();
        for( int i=1;i<=num;i++)
        {
            System.out.print(i +" ");
        }
    }
}