import java.util.Scanner;
class Nestedelseif
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
        if(a>b && a>c)
        System.out.println(a+"is greater");
        else if(b>c)
        System.out.println(b+"is greater");
        else 
        System.out.println(c+"is greater");


        
    }
}