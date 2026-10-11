
import java.util.Scanner;
public class FindMisssingNumberXOR {
    public static int missingNumber(int arr[],int N)
    {
        int n=N-1;
        int XOR1=0,XOR2=0;
        for(int i=0;i<n;i++)
        {
            XOR2=XOR2^arr[i];
            XOR1=XOR1^(i+1);
        }
        XOR1=XOR1^N;
        return XOR1^XOR2;
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
 System.out.print(missingNumber(arr,n));
 sc.close();

}
}