import java.util.Scanner;
class Num1
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the num1:");
        int num1=sc.nextInt();
        System.out.print("Enter the num2:");
        int num2=sc.nextInt();
        int res=(num1>num2)?num1:num2;
        System.out.println("The largest number is:"+res);
    }
}