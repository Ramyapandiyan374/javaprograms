import java.util.Scanner;
class DecimalToBinary
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enter the decimal:");
        int decimal=sc.nextInt();
        String ans=" ";
        while(decimal>0)
        {
            ans=decimal%2+ans;
            decimal/=2;
            
        }
        System.out.println(ans);
    }
}