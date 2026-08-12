import java.util.Arrays;
import java.util.Scanner;
class FindSecondSmallest
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int smallest=arr[0];
        int second=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]<smallest)
            {
                second=smallest;
                smallest=arr[i];
            }
            else if(arr[i]<second&& arr[i]!=smallest)
            {
                second=arr[i];
            }
    }
    System.out.println("Second smallest:"+ second);
}
}