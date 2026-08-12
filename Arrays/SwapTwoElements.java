import java.util.Arrays;
import java.util.Scanner;
class SwapTwoElements
{
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    
    swap(arr,1,3);
    
    System.out.println(Arrays.toString(arr));
}
   static void swap(int []arr,int index1,int index2)
    {
         int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
