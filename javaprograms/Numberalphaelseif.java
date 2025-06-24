import java.util.Scanner;
class  Numberalphaelseif
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("enter any value");
        char value=sc.next().charAt(0);
        if(value>='0' && value<='9')
        System.out.println("the given value is number");
        else if(value<='A' && value>='Z' || value>='a' && value<='z')
        System.out.println("the given value is alphapet");
        else
        System.out.println("the given value is special case");

    }
}