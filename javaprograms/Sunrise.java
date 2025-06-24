import java.util.*;
class Sunrise
{
    public static void main(String[]args)
    {
        int []a={5,4,6,3,5,7};
        solve(a);
    }
    public static void solve(int []a)
    {
        int count=1;
        int max=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
                count++;

            }
            
            
            
        }
        System.out.println(count);
    }
}