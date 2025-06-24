import java.util.Scanner;
class AverageArray
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        int []a={1,4,5,6,3,1};
        solve(a);
         
            
    }
    public static void solve(int []a)
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
         double res=sum/a.length;
        System.out.println(res);

    }
}