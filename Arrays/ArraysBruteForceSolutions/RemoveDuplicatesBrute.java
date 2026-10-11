

import java.util.*;
public class RemoveDuplicatesBrute {
    public static void main(String[]args)
    {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []arr=new  int [n];
for(int i=0;i<n;i++)
{
    arr[i]=sc.nextInt();
}
HashSet <Integer>set=new HashSet<>();
for(int i=0;i<n;i++)
{
set.add(arr[i]);
}
int index=0;
for(int result:set)
{
    arr[index]=result;
    index++;
}
for(int i=0;i<index;i++)
{
    System.out.print(arr[i]+" ");
}
sc.close();
}

    }

