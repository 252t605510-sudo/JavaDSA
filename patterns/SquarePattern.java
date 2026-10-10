import java.util.Scanner;
public class SquarePattern
{
    public static void main(String [] args)
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        for(int i=1;i<=num; i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
        in.close();
    }
}