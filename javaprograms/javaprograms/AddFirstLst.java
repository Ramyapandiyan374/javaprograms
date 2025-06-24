import java.util.Scanner;
class AddFirstLst
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        Sytem.out.print("Enter the number:");
        int number=sc.nextInt();
        Last=number%10;
        if(number>=0 && number<=9);
        {
            System.out.println("It is singlee digit");
        }
        else
        {
            while(number>0)
            {
                number/=10;
            }
            System.out.println("the addition of first and last digit:"+last+number);
        }

    }
    
}