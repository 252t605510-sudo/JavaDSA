import java.util.Scanner;
class IfExample
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int age=in.nextInt();
        if(age>=18)
        {
            System.out.println("eligible for vote");
        }
        System.out.println("hello world");
    }
    
    
}