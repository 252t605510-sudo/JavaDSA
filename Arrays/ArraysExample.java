import java.util.Arrays;
import java.util.Scanner;
class ArrayExample
{
    public static void main(String[]args)
    {
    Scanner in=new Scanner(System.in);
    System.out.print("enter the number fo elements:");
    int n=in.nextInt();
    int []arr=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=in.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    
    
}
}