import java.util.Scanner;
class Char
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the percentage:");
        int percentage=sc.nextInt();
        if(percentage>=70)
        System.out.println("Distinction");
        else if(percentage>=60)
        System.out.println("First Class");
        else if(percentage>=50)
        System.out.println("Second Class");
        else if(percentage>=30)
        System.out.println("Pass");
        else
        System.out.println("Invalid");



    }
}