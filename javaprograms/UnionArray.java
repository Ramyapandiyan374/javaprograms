import java.util.*;
class UnionArray
{
    public static void main(String[]args)
    {
        int []a={1,2,3};
        int[]b={3,4,5};
        System.out.println("Array of a:"+Arrays.toString(a));
        System.out.println("Array of b:"+Arrays.toString(b));
        solve(a,b);
    }
    public static void solve(int []a,int []b)
    {
        int temp[]=new int[a.length+b.length];
        for(int i=0,m=0,n=0;i<temp.length;i++)
        {
             if(m<a.length)
             temp[i]=a[m++];
             else if(n<b.length)
             temp[i]=b[n++];
        }
        int count=0;
        for(int i=0;i<temp.length;i++)
        {
            if(temp[i]==Integer.MIN_VALUE)
            continue;
            for(int j=i+1;j<temp.length;j++)
            {
                if(temp[i]==temp[j])
                {
                    
                    temp[j]=Integer.MIN_VALUE;
                    count++;
                }
            }
        }
        int res[]=new int[temp.length-count];
        for(int i=0,m=0;i<temp.length;i++)
        {
            if(temp[i]!=Integer.MIN_VALUE)
            res[m++]=temp[i];
        }
        System.out.println("union of two arrays"+Arrays.toString(res));
    }
}