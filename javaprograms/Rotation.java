import java.util.*;
class Rotation
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.println("enter the n:");
        int n=sc.nextInt();
        int []a={10,20,40,50};
        solve(a,n);
    }
    public static void solve(int []a,int n)
    {
        System.out.println(Arrays.toString(a));
        for(int k=1;k<=n;k++)
        {
            int first=a[0];
            for(int i=0;i<a.length-1;i++)
            {
                a[i]=a[i+1];
            }
            a[a.length-1]=first;
        }
        System.out.println(Arrays.toString(a));
    }
}