
//time complexity:O(n)
//space complexity:O(d)import java.util.Scanner;
import java.util.Scanner;
public class leftRotateArrayByDPlaces {
public static  int[] leftRotate(int arr[],int n,int d)

{
d=d%n;
int []temp=new int[d];
//store first d elements
for(int i=0;i<d;i++)
{
    temp[i]=arr[i];
}
//shift remaining elements to the  left
for(int i=d;i<n;i++)
{
    arr[i-d]=arr[i];
}
//put temp elements at the end
for(int i=0;i<temp.length;i++ )
{
    arr[n-d+i]=temp[i];
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
    int d=sc.nextInt();
arr=leftRotate(arr,n,d);
for(int i=0;i<n;i++)
{
    System.out.print(arr[i]+" ");
}
sc.close();

}
}
