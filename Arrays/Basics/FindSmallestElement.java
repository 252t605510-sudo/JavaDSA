import java.util.Arrays;
import java.util.Scanner;
class FindSmallElelment{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n=in.nextInt();
        int []arr=new int[n];
       
      
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        
         int smallest=arr[0];
        for(int i=1;i<n;i++){
        
        
            
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
            
            
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Smallest element:"+smallest);
        
        in.close();
    }
}