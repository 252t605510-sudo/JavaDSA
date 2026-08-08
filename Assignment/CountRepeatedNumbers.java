import java.util.Scanner;

public class CountRepeatedNumbers
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the numbers:");
        int num=in.nextInt();
        System.out.print("enter the targeted digit:");
        int targetDigit=in.nextInt();
        
     
        int count=0;
        while(num>0)
        {
            int rem =num%10;
        
        if(rem==targetDigit)
        {
            count++;
        }
        num=num/10;
    }
    System.out.println("the number  " +targetDigit+" repeated " + count + "  times");
    in.close();
}
}