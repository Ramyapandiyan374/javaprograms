
import java.util.*;
class AddingSubArray
{
    public static void main(String[]args)
    {
        int []a={-3,2,4,5,-2};
        int res=solve(a);
        System.out.println(res);
    }
    public static int solve(int []a)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                }
                max=Math.max(sum,max);

            }
        }
        return max;
    }
}