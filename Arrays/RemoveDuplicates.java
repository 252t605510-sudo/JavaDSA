import java.util.Arrays;
import java.util.Scanner;
class RemoveDuplicates
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
       
       
        for(int i=0;i<n;i++)
        {
             boolean duplicate=false;
             for(int j=0;j<i;j++)/* the j loop is used to check the
             current i element against the previous elemnts */
             {
                if(arr[i]==arr[j])
                {
                    duplicate=true;
                    break;
                  
                  
                }
            }
            if(!duplicate)
            {
                System.out.print(arr[i]+ " ");
            }
        }
        }
}