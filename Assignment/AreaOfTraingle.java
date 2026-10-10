import java.util.Scanner;
public class AreaOfTraingle
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the base:");
        int base=in.nextInt();
        System.out.print("enter the height:");
        int height=in.nextInt();
         System.out.print("Area of the Traingle:"+(base*height)/2);
    }
}