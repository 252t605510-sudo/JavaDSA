import java.util.Scanner;
class ElectricityBill
{
    
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.print("enter units consumed:");
        int units=in.nextInt();
        double bill=0;
        if(units<=100)
        {
            bill=units*1.5;
        }
        else if(units<=200){
            bill=(100*1.5)+(units-100)*2.5;
        }
        else if(units<=300){
            bill=(100*1.5)+(100*2.5)+(units-200)*4.0;
        }
        else{
            bill=(100*1.5)+(100*2.5)+(100*4.0)+(units-300)*5.0;
        }
        System.out.print("Electricity bill="+bill);
        in.close();
    }
}