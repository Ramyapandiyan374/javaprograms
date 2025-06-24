import java.util.Scanner;
class Calculator
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        boolean operator=true;
        do
        {
        System.out.print("Enter a:");
        double a=sc.nextDouble();
        System.out.print("Enter b:");
        double b=sc.nextDouble();
        System.out.println("Choose you arithmetic operator:");
        System.out.println("-------------------------------");
        System.out.println("1.Add\n2.Subraction\n3.Multiplication\n4.Division");
        int calculator=sc.nextInt();
        
        switch (calculator)
        {
            case 1:{
                double add=a+b;
                System.out.println("The addition of given number is:"+add);
                break;}
                case 2:{
                    double sub=a-b;
                    System.out.println("The subraction of given number is :"+sub);
                    break;}
                    case 3:{
                    double multi=a-b;
                    System.out.println("The Multiplication of given number is :"+multi);
                    break;}
                    case 4:{
                    double div=a-b;
                    System.out.println("The Division of given number is :"+div);
                    break;}
                    default:{operator=false;
                        System.out.println("There is no except this arithmetic operator");
                        break;}


        }
        }
        while(operator);
    }
}