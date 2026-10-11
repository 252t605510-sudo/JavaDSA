import java.util.Scanner;
public class AreaOfEquilateralTraingle
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the  side of the traingle:");
        int side=in.nextInt();
   
   
         System.out.print("Area of the Equilateral Traingle:"+ 0.433*(side*side));
         in.close();
    }
    
}