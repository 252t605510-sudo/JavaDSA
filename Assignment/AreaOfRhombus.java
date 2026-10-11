import java.util.Scanner;
public class AreaOfRhombus
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the value of vertical diagonal:");
        int  d1=in.nextInt();
        System.out.print("enter the  value of horizontal diagonal:");
        int d2=in.nextInt();
         System.out.print("Area of the rhombus:"+(d1*d2)/2);
         in.close();
    }
}