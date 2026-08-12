import java.util.Arrays;
import java.util.Scanner;
class CountFrequency
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
        int element=in.nextInt();
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==element)
        
            {
                count ++;
            }
        }
        System.out.println("the element " + element 
        + " repeated " +count + " times ");
    }
}