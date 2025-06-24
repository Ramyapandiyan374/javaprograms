import java.util.Scanner;
class HappyNo
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        while(number!=1 && number!=4)
        {
            int sum=0;
            while(number>0)
            {
                sum+=(number%10)*(number%10);
                number/=10;
            }
            number=sum;
        }
        System.out.println(number==1?"Happy number":"Not happy number");
    }
}