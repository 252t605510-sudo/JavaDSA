import java.util.Arrays;
import java.util.Scanner;
class FindMissingNumber
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
       for(int i=1;i<=n+1;i++ )
       {
           boolean found=false;
           for(int j=0;j<n;j++)
           {
               if(i==arr[j])
               {
                   found=true;
                   break;
               }
           }
           if(!found)
           {
               System.out.print("Missing number:"+i);
           }
           
       }
       in.close();
    }
}