import java.util.Scanner;
class AverageOfNumbers
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter how many numners:");
        int n=in.nextInt();
        int sum=0;
        double average =0;
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter numner"+i+":");
            int num =in.nextInt();
            sum=sum+num;
            average=sum/n;
        }
        System.out.println("Average:"+average);
    }
}