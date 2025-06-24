import java.util.Scanner;
class Factorials
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("enter the factorial number:");
        int n=sc.nextInt();
        int e=1;
        for(int i=1;i<=n;i++)
        {
            e*=i;
        }
        System.out.println("The factorial number of "+n+" is"+e);
    }
}