import java.util.Scanner;
class Tables
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Multiplication table:");
        int e=sc.nextInt();
        System.out.print("Enter the starting number:");
        int i=sc.nextInt();
        System.out.print("Enter the ending number:");
        int n=sc.nextInt();
        while(i<=n)
        {
            System.out.println(i+"*"+e+"="+i*e);
            i++;
        }
    }
}