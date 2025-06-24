import java.util.Scanner;
class S3
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("enter the number:");
        int number=sc.nextInt();
        String res=(number>0)?"positive":"negative";
        System.out.println("is the number is positive:"+number);
    }
}