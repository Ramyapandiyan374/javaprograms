import java.util.Scanner;
class RightLeftArray
{
    static Scanner sc=new Scanner(System.in);
        public static void main(String[]args)
    {
        System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        int []a=new int[size];
        solve(a);


    }
    public static void solve(int []x)
    {

        for(int i=x.length-1;i>=0;i--)
        {
            System.out.print("Enter the elements x["+i+"]:");
            x[i]=sc.nextInt();

            
        }
        for(int i=x.length-1;i>=0;i--)
        {
            System.out.print(x[i]+" ");
        }

    }
} 

