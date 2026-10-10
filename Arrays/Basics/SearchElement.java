import java.util.Scanner;
import java.util.Arrays;
class SearchElement
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int search=in.nextInt();
        boolean found=false;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==search)
            {
                found=true;
                break;
            }
        }
        
        
        if(found)
        {
            System.out.println("Element found");
        }
        else{
            System.out.println("element not found");
        }
        in.close();
    }
}