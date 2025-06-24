import java.util.Scanner;
class Dorasss{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        System.out.print("Enter the Starting range:");
        int start=sc.nextInt();
        System.out.print("Enter the Ending range:");
        int end=sc.nextInt();
        
           
        
        
        
            for(int i=start;i<=end;i++)
            {
                if(i<2)
            continue;
                boolean  isprime=true;
                for(int j=2;j<i;j++)
                {
                    if(i%j==0)
                    {
                        isprime=false;
                        break;
                    }
                    
                }
                if(isprime)
                    System.out.println(i);
            }
        
        
        
        
    }
}