import java.util.Scanner;
class Strong
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int sum=0,temp=n;
        while(n>0)
        {
            int product=1;
            int last=n%10;
            for(int i=2;i<=last;i++)
            {
                product*=i;
            }
            sum+=product;
            n/=10;
        }
        if(sum==temp)
        {
            System.out.println("Strong number");
        }
        else
        {
            System.out.println("Not a strong number");
        }
    }
}