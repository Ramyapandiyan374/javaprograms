import java.util.Scanner;
class Nestedofthree
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("enter a:");
        int a=sc.nextInt();
        System.out.print("enter b:");
        int b=sc.nextInt();
        System.out.print("enter c:");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+"is a largest");
            }
            else
            {
                System.out.println(c+"is a largest");
            }
        }
            
        else
        {
            System.out.println(b+"is a largest");
        }
    }
}