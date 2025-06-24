import java.util.Scanner;
class Dorasss
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
      System.out.print("Enter the number:");
      int num=sc.nextInt();
      int original=num;
      int last =num%10;
      int firstdigit=0;
      int middlesum=0;
      num=num/10;
      while(num>9)
      {
        middlesum+=num%10;
        num/=10;
      }
      firstdigit=num;
      int outersum=firstdigit+last;
      if(outersum==middlesum)
      {
        System.out.println(original+"Xylem");
      }
      else
      System.out.println(original+"pholem");

    }
}