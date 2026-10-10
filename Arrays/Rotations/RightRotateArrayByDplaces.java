//Approach:
//1.Reverse the entire array
//2.reverse the first d elemnts
//3.then reverse the remainingelemnts
//time complexity:O(n)
//space complexity:O(1)



import java.util.Scanner;
public class RightRotateArrayByDplaces {
    public static void reverse(int[]arr,int start,int end)
    {
        while(start<end)
        {
         int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;
        }
    }
    public static void rotate(int[]arr,int d)
    {
        int n=arr.length;
     d=d%n;
     reverse(arr,0,n-1);
     reverse(arr,0,d-1);
     reverse(arr,d,n-1);
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
        int d=sc.nextInt();
        rotate(arr, d);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
