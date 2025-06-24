import java.util.Scanner;
class Numberrange
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("enter a number:");
        int number=sc.nextInt();
        if(number<10)
        System.out.println("the given number is small");
        else if(number>10 && number<100)
        System.out.println("the given number is medium");
        else
        System.out.println("the given number is large");
        
    }
}