import java.util.Arrays;
import java.util.Scanner;
class FindSecondLargest
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
        int largest=arr[0];
        int second=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>largest)
            {
                second=largest;
                largest=arr[i];
            }
            else if(arr[i]>second&& arr[i]!=largest)
            {
                second=arr[i];
            }
    }
    System.out.println("Second Largest:"+ second);
}
}