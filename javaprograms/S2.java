import java.util.Scanner;
class S2
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter yor age:");
        int age=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your salary:");
        long salary=sc.nextLong();
        System.out.print("Enter your first name:");
        char letter=sc.next().charAt(0);
        System.out.println("Employee age:"+age);
        System.out.println("Employee name:"+name);
        System.out.println("Employee salary:"+salary);
        System.out.println("Employee first letter:"+letter);
    }
}