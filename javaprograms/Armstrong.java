import java.util.Scanner;
class Armstrong
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        for(int i=n;i>0;count++)
        {
            i/=10;
        }
        int sum=0,ans=1;
        for(int i=n;i>0;i/=10,ans=1)
        {
            int last=i%10;
            for(int j=1;j<=count;j++)
            {
                ans*=last;
            }
            sum+=ans;
        }
        System.out.println(n==sum?"Armstrong":"Not Armstrong");
    }
}