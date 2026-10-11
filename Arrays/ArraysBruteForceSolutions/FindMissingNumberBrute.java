/* 
Approach:Brute force using nested loops
time complexity:O(n^2)
space complexity:O(1)

 */
import java.util.Scanner;
public class FindMissingNumberBrute
 {
    public static int  missingNumber(int []arr)
    {
int n=arr.length;
//check every number from 0 to n
    for(int i=0;i<n;i++)
{
    boolean found=false;
    // search for i in the array
    for(int j=0;j<n;j++)
    {
        if(arr[j]==i)
        {
            found=true;
            break;
        }
    }
//if the number is not fount ,it is missing
    if(found==false)
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
int[]arr=new int[n-1];
for(int i=0;i<n-1;i++)
{
    arr[i]=sc.nextInt();
}
 System.out.print(missingNumber(arr));
 sc.close();

    }
}
