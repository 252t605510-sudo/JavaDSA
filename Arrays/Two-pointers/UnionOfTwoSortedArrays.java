/*
Approach:two pointer
time complexity:O(n1+n2)
space complexity:O(n1+n2)
 */
import java.util.Scanner;
public class UnionOfTwoSortedArrays {
    public static int []union(int arr1[],int arr2[],int n1,int n2)
        {
int []temp=new int[n1+n2];
int count=0;
int i=0;
int j=0;
//add the smaller element
while(i<n1&&j<n2)
{
    if(arr1[i]<arr2[j])
    {
        //add only if the element is not already present
        if(count==0||temp[count-1]!=arr1[i])
        {
            temp[count]=arr1[i];
            count++;
        }
        i++;

    }
    else if(arr2[j]<arr1[i])
    {
        if(count==0||temp[count-1]!=arr2[j])
        {
            temp[count]=arr2[j];
            count++;
        }
        j++;
    }
    else
    {
        //add if the both elements are equal ,add it only once
        if(count==0||temp[count-1]!=arr1[i])
        {
temp[count]=arr1[i];
count++;
        }
        i++;
        j++;
    }
}
// add remaining elements in arr1
    while(i<n1)
    {
        if(count==0||temp[count-1]!=arr1[i])
        {
            temp[count]=arr1[i];
            count++;
        }
        i++;

    }
    //add remaining elements of arr2
    while(j<n2)
    {
        if(count==0||temp[count-1]!=arr2[j])
        {
            temp[count]=arr2[j];
            count++;
        }
        j++;
}
// create an array with the exact union size
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
    for(int i=0;i<n1;i++)
    {
        arr2[i]=sc.nextInt();
    }
    int[]result=union(arr1, arr2, n1, n2);
    for(int i=0;i<result.length;i++)
    {
        System.out.print(result[i]+" ");
    }
    sc.close();
    }
}
