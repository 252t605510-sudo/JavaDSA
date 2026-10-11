/*
Approach:single traversal using count 
and max variables
time complexity:O(n)
space complexity:O(1);

 */
import java.util.Scanner;
public class MaximumConsectiveOnesOptimal {
    public static int maximumConsectiveOnes(int []arr)
    {
        int n=arr.length;
        int max=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count++;
                max=Math.max(max,count);
            }
            else{
                count=0;
            }
        }
        return max;
    }
        public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
     int ans=maximumConsectiveOnes(arr);
     System.out.print(ans);
     sc.close();

    }
}
