
import java.util.Scanner;
public class IntersectionOfTwoSortedArrays {
    public static  int [] intersection(int[] arr1,int []arr2,int n1,int n2)
    {
        int []temp=new int [Math.min(n1,n2)];
        int i=0;
        int j=0;
        int count=0;
        while(i<n1&&j<n2)
        {
            if(arr1[i]==arr2[j])
            {
                temp[count]=arr1[i];
                count++;
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j])
            {
                i++;
            }
            else{
                j++;
            }
        }
            int []ans=new int[count];
            for(int k=0;k<count;k++)
            {
                ans[k]=temp[k];
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
int []arr2=new int[n1];
for(int i=0;i<n2;i++)
{
    arr2[i]=sc.nextInt();
}
int []result=intersection(arr1, arr2, n1, n2);
for(int i=0;i<result.length;i++)
{
    System.out.print(result[i]+" ");
}
sc.close();
    }
}
