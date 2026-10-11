import java.util.Scanner;
public class AreaOfRectangle
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the length:");
        int length=in.nextInt();
        System.out.print("enter the width:");
        int width=in.nextInt();
         System.out.print("Area of the rectangle:"+length*width);
         in.close();
    }
}