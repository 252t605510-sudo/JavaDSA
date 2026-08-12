import java.util.Scanner;
import java.util.Arrays;
class CopyArray
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr1=new int[n];
        int []arr2=new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
            
        }
        for(int i=0;i<n;i++)
        {
           arr2[i]=arr1[i]; 
        }
        for(int i=0;i<n;i++)
        {
        System.out.print(arr2[i]+" ");
    }
    }
}