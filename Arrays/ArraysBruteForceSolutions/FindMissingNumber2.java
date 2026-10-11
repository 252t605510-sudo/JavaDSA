
import java.util.Scanner;
public class FindMissingNumber2 {
    public static int missing(int []arr,int n)
    {
int sum=n*(n+1)/2;// sum of Natural numbers
     int sum2=0;
     for(int i=0;i<n-1;i++)// iterate through the array
     {
        sum2=sum2+arr[i];
     }
     return (sum-sum2);
    }
    public static void main(String[]args)
    {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[]arr=new int[n-1];
for(int i=0;i<n-1;i++)
{
    arr[i]=sc.nextInt();
}
System.out.print(missing(arr, n));
 sc.close();

}
}