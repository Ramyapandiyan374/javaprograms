import java.util.Scanner;
class Numberalphaswitch
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the character:");
        char data=sc.next().charAt(0);
        int data1=(data>='0' && data<='9')?1:(data>='a' && data<='z')?2:3;
        switch (data1)
        {
            case 1:{
                System.out.println("it is number");
                break;}
                case 2:{
                    System.out.println("it is a alphapet");
                    break;}
                    default:{
                        System.out.println("it is a special case");
                        break;}
        }
    }
}