/*Approach: use two pointers to find zeros and 
swap them with the next non-zero elements
time complexity:O(n)
space complexity:O(1)
 */
import java.util.Scanner;
public class MoveZerosToEnd {
    public static void swap(int arr [],int i,int j)
    {
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
    }
    public static int[] moveZeros(int arr[],int n )
    {
        int j=-1;
        //find the first zero
        for(int i=0;i<n;i++)
        {
        if(arr[i]==0)
        {
            j=i;
            break;
        }
    }
    //if there is no zero
    if(j==-1)
    {
        return arr;
    }
    //move non-zero elemnts to the zero positions
    for( int i=j+1;i<n;i++)
    {
        if(arr[i]!=0)
        {
swap(arr,i,j);
j++;
        }
    }
    return arr;
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
int []result=moveZeros(arr, n);
for(int i=0;i<n;i++)
{
    System.out.print(result[i]+" ");
}
sc.close();
}
    
}
