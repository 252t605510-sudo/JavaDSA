import java.util.Scanner;
public class NumberAppearOnceXOR {
    public static int numberOnce(int []arr)
    {
        int n=arr.length;
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor=xor^arr[i];
        }
        return xor;
    }
   public static void main(String[]args)
   {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++)
    {
arr[i]=sc.nextInt();
    }
    System.out.print(numberOnce(arr));
    sc.close();
   } 
}
