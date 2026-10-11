import java.util.Scanner;
public class MoveZeros {
    public static int[] moveZero(int[]arr,int n)
    {
        //store non-zero elemnts
        int[]temp=new int[n];
      int  j=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                temp[j]=arr[i];
                j++;
            }
        }
        //copy non-zero elemnts back
        for(int i=0;i<n;i++)
        {
            arr[i]=temp[i];
        }
        //fill remaining positions with zeros
        for(int i=j;i<n;i++)
        {
            arr[i]=0;
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
int []result=moveZero(arr,n);
for(int i=0;i<n;i++)
{
    System.out.print(result[i]+" ");
}
sc.close();
    }
}
//Approach:use a temporary array to store all non-zero
//  elements,the fill the remaining positions with zeros
//time complexity:O(n)
//space complexity:O(n)if the array has no Zeros