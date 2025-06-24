import java.util.*;
class RemoveDuplicates
{
    public static void main(String[]args)
    {
        int []a={2,4,2,6,7,6
        };
        solve(a);
    }
    public static void solve(int []a)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==Integer.MIN_VALUE)
            continue;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    a[j]=Integer.MIN_VALUE;
                }
            }
        }
        int res[]=new int[a.length-count];
        for(int i=0,x=0;i<a.length;i++)
        {
            if(a[i]!=Integer.MIN_VALUE)
            {
                res[x++]=a[i];
            }

        }
        System.out.println(Arrays.toString(res));
    }
}