import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter the radius:");
        int radius=in.nextInt();
        float pi=3.14f;
        System.out.println("Area of the Circle:"+pi*radius*radius);
    }
}