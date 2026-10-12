import java.util.Scanner;
import java.util.HashMap;
public class NumberThatAppearsOnceHashMap
{
    public static int number(int arr[])
    {
        int n=arr.length;
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    for(int i=0;i<n;i++)
    {
        if(map.get(arr[i])==1)
        {
            return arr[i];
        }
    }
    return -1;

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
    int ans=number(arr);
    System.out.print(ans);
    sc.close();
}
}
