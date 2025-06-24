import java.util.Scanner;
class Vowel
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("enter a letter:");
        char letter=sc.next().charAt(0);
        if(letter=='a' || letter=='e' || letter=='i'|| letter=='o' || letter=='u')
        System.out.println("the letter is vowel");
        else 
        System.out.println("the letter is : consonent");
    }
}