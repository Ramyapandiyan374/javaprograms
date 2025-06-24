import java.util.Scanner;
class PerfectNumber
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum+=i;
            }
            
        }
        if(sum==n)
        {
        System.out.println(sum+"is a perfect number");
        }
        else
        {
            System.out.println(sum+"is not a perfect number");
        }
    }
}