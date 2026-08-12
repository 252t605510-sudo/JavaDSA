import java.util.Scanner;
class FindLargsestElement
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number of elements:");
        int n=in.nextInt();
        int []arr=new int[n];
        int  largest=arr[0];
        //taking input
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
           
               
            
        }
        //printing the elements
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("largset element:"+largest);
}
}