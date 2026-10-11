import java.util.Scanner;
public class FindMissingNumberBrute
 {
    public static int  missingNumber(int []arr)
    {
int n=arr.length;

    for(int i=0;i<n;i++)
{
    boolean found=false;
    for(int j=0;j<n;j++)
    {
        if(arr[j]==i)
        {
            found=true;
            break;
        }
    }

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
int[]arr=new int[n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
 System.out.print(missingNumber(arr));
 sc.close();

    }
}
