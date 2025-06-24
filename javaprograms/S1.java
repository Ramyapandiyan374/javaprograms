import java.util.Scanner;
class S1
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args) throws Exception
    {
        System.out.print("Enter your name:");
        String name=sc.nextLine();
        System.out.print("Enter your age:");
        int age=sc.nextInt();
        System.out.print("Enter your marks:");
        double marks=sc.nextDouble();
        System.out.println("Student details processing...");
        Thread.sleep(2000);
        System.out.println("student name:"+name);
        System.out.println("Student age:"+age);
        System.out.println("student marks:"+marks);
    }

}