import java.util.Scanner;
class SumOfNatural
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the ending number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println(sum);
    }
}