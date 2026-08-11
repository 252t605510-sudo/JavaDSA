import java.util.Arrays;
import java.util.Scanner;
class PrintElements
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n=in.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }
}
}