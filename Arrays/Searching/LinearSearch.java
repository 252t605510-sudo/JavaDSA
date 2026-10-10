import java.util.Scanner;
public class LinearSearch {
    public static int linear(int[]arr,int k)
    {
int n=arr.length;
    
    for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                return i;
            }
        }
            return -1;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
    System.out.print(linear(arr, k));
    sc.close();
    
    }
}
