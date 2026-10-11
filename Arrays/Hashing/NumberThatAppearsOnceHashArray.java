/*
Approach: create a hash array to store 
the frequency of each element
=>Traverse the array  and increment thenncount of each elemnt
=>return the elemnt whose frequency is 1
Time complexity:O(n+M)=>"M" is size of the hash array
Space complexity:O(M)

 */
import java.util.Scanner;
public class NumberThatAppearsOnceHashArray {
    public static int singleNumber(int[]arr)
    {
        int n=arr.length;
        int max=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>max)
            {
             max=arr[i];
            }
        }
        int []hash=new int [max+1];
        for(int i=0;i<n;i++)
        {
            // increment the count of each element
            hash[arr[i]]++;
        }
        for(int i=0;i<n;i++)
        {//return the elemnt whose frequency is 1
            if(hash[arr[i]]==1)
            {
             return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[]args)
    {
        Scanner sc= new Scanner (System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
        {
         arr[i]=sc.nextInt();
        }
        System.out.print(singleNumber(arr));
        sc.close();
    }
    
}
