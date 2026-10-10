//problem:Remove Duplicates from Sorted Array
//Approach:Two pointers
// Time complexity:O(n)
// Space Complexity:O(1) 
import java.util.Scanner;
public class RemoveDuplicateFromSortedArray {
    public  static int removeDuplicate(int arr[],int n)
    {
    
        int i=0;
        for(int j=1;j<n;j++)
        {
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
            i++;
            }
        }
        return i+1;//return counts of unique elemnets
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
int result=removeDuplicate(arr,n);
for(int i=0;i<result;i++)
{
System.out.print(arr[i]+" ");
}
sc.close();
}
}