import java.util.Scanner;
class Percentage
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("enter the percentage:");
        int perc=sc.nextInt();
        char res=(perc>=75)?'A':(perc>=50)?'B':(perc>=35)?'C':'D';
        System.out.println("the grade is :"+res);
    }
}