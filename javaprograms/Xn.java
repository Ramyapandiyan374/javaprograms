import java.util.Scanner;
class Xn
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the x value:");
        int x=sc.nextInt();
        System.out.print("Enter the n value:");
        int n=sc.nextInt();
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans*=x;
        }
        System.out.println("Result:"+ans);
    }
}