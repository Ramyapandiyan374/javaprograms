import java.util.Scanner;
class Sum
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the n:");
        int n=sc.nextInt();
        int number=1,sum=0;
        while(number<=n)
        {
            sum+=number;
            number++;
        }
        System.out.println("The sum of given natural number is:"+sum);

        

    }
}