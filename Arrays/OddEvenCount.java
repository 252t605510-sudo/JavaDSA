import java.util.Scanner;
import java.util.Arrays;
class OddEvenCount
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the no of elements:");
        int n=in.nextInt();
        int  []arr=new int[n];
         for(int i=0;i<n;i++){
             arr[i]=in.nextInt();
         }
         int even=0;
         int odd=0;
         for (int i=0;i<n;i++){
         if(arr[i]%2==0)
         {
             even++;
         }
         else{
             odd++;
         }
         }
         System.out.println(Arrays.toString(arr));
         System.out.println("even count:"+even);
         System.out.println("odd count:"+odd);
    
    }
    
}