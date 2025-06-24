import java.util.Scanner;
class Numberalpha
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("enter any value:");
        char value=sc.next().charAt(0);
        String res=(value>='0' && value<='9')?"number":(value>='a' && value<='z' || value>='A' && value<='B')?"alphapet":"special case";
        System.out.println("the given input:"+res);
    }
}