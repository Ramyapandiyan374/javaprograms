import java.util.Scanner;
class Num2
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the num1:");
        int num1=sc.nextInt();
        System.out.print("Enter the num2:");
        int num2=sc.nextInt();
        System.out.print("Enter the num3:");
        int num3=sc.nextInt();
        System.out.print("Enter the num4:");
        int num4=sc.nextInt();
        int res=(num1>num2 && num1>num3)?num1:(num2>num3 && num2>num4)?num2:(num3>num4?num3:num4);
        System.out.println("the largest number is:"+res);
    }
}