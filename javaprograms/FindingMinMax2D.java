import java.util.*;
class FindingMinMax2D
{
    public static void main(String[]args)
    {
        int [][]a={{2,1,16,7},{8,1,-3,4},{
            2,1,7,8},};
            for(int i=0;i<a.length;i++)
            {
                solve(a[i]);
            }
        
    }
    public static void solve(int []a)
    {
        int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            min=Math.min(a[i],min);
            max=Math.max(a[i],max);
        }
        System.out.println("max"+max+"min"+min);
    }
    
    
}