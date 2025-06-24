import java.util.*;
class TrappingRainWater
{
    public static void main(String[]args)
    {
        int []a={4,2,0,3,2,5};
        int res=solve(a);
        System.out.println(res);
    }
    public static int solve(int []a)
    {
        int[]lm=new int[a.length];
        lm[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            lm[i]=Math.max(a[i],lm[i-1]);
        }
        int []rm=new int[a.length];
        rm[rm.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            rm[i]=Math.max(a[i],rm[i+1]);

        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
        int wl=Math.min(lm[i],rm[i]);
        sum+=wl-a[i];
        }
        return sum;
    }
}