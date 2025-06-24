import java.util.*;
class Selection
{
    public static void main(String[]args)
    {
        int []a={10,43,5,36,34,24,3,64,18};
        solve(a);
    }
    public static void solve(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            int s=i;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]<a[s])
                s=j;
            }
            int temp=a[i];
            a[i]=a[s];
            a[s]=temp;

        }
        System.out.println(Arrays.toString(a));
    }
}