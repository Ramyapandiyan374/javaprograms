import java.util.Scanner;
class Dorasss{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        int temp=num;
       
             int fact=num*num;
            
            
            int sum=0;
            while(fact>0)
            {
                sum+=fact%10;
                fact/=10;
            }

            System.out.println((sum==temp?"Neon number":"Not neon number"));
                
            
            
         


    }
}