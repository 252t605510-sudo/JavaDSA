/*
Approach:Brute force using nested loops
time complexity:O(n^2)
space complexity:O(1)
 */
import java.util.Scanner;
public class MaximumConsectiveOnesBrute {
    public static int maximumOnes(int arr[])
    {
int n=arr.length;
    
    int max=0;
     for(int i=0;i<n;i++)
     {
        int count=0;
        for(int j=i;j<n;j++)
        {
            if(arr[j]==1)
            {
                count++;
                max=Math.max(max,count);
            }
            else{
                break;
            }
            
        }
     }
     return max;
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
     int ans=maximumOnes(arr);
     System.out.print(ans);
     sc.close();
     
    }
}
