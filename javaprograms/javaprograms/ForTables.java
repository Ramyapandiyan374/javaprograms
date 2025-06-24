import java.util.Scanner;
class ForTables
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the multiplication tabel:");
        int e=sc.nextInt();
        System.out.print("Enter the starting number:");
        int start=sc.nextInt();
        System.out.print("Enter the ending number:");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++)
        {
            System.out.println(i+"*"+e+"="+i*e);
        }

    }
}