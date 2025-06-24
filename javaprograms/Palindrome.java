import java.util.Scanner;
class Palindrome
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the number:");
        int number=sc.nextInt();
        int temp=number,rev=0;
        while(number>0)
        {
            rev=rev*10+number%10;
            number/=10;
        }
        if(temp==rev)
        {
            System.out.println(temp+" is palindrome");
        }
        else
        {
            System.out.println(temp+"is not Palindrome");
        }
        
    }
}