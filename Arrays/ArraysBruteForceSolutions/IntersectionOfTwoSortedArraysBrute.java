/*Approach:brute force
time complexity:O(n^2)
Space complexity:O(n2)=>for vis[]ans result /temporary array
 */ 
 import java.util.Scanner;
public class IntersectionOfTwoSortedArraysBrute 
{
public static int[]intersection(int arr1[],int arr2[],int n1,int n2)
{
    int[] temp=new int[Math.min(n1,n2)];
    int count=0;
    boolean []vis=new boolean[n2];// to avoid counting the same element more than once
    for(int i=0;i<n1;i++)//arr1
    {
        for(int j=0;j<n2;j++)//arr2
        {
//check whethe the elemnts match and arr2 element is not used
            if(arr1[i]==arr2[j]&&!vis[j])
            {
                temp[count]=arr1[i];
                count++;
                //mark the elemnt as used to avid duplicates
                vis[j]=true;
                break;
            }
if(arr2[j]>arr1[i])
{
    break;
}
        }
    }
    int[] ans=new int[count];
for(int i=0;i<count;i++)
{
    ans[i]=temp[i];
}
return ans;
}
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int []arr1=new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        int n2=sc.nextInt();
        int []arr2=new int[n2];
        for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }

int []result=intersection(arr1, arr2, n1, n2);
for(int i=0;i<result.length;i++)
    {

    System.out.print(result[i]+" ");
    sc.close();
}
    }
}

