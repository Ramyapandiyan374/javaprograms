import java.util.Scanner;
class BinaryToDecimal
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the binary:");
        int binary=sc.nextInt();
        int x=1,sum=0;
        while(binary>0)
        {
            sum+=binary%10*x;
            x*=2;
            binary/=10;
        }
        System.out.println(sum);
    }
}