
import java.util.Scanner;
class FindSum
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n=in.nextInt();
        int []arr=new int[n];
        int sum=0;
        //taking input
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
            sum=sum+arr[i];
        }
        //printing the elements
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("sum:"+sum);
    in.close();
}
}