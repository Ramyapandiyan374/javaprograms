import java.util.*;
class Rotations
{
    public static void main(String[]args)
    {
        int [][]a={{8,-3,4,16,1},{1,2,3,4,5},{8,1,6,7,8},{1,1,1,0}};
        solve(a);
        dingi(a,2);
        
    }
    public static void solve(int [][]a){
        
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;            
            for(int j=0;j<a[0].length;j++)
            {
                max=Math.max(a[0][j],max);
                min=Math.min(a[0][j],min);
                
            }
            System.out.print(min+" "+max+" ");
        
    }
    public static void dingi(int [][]a,int n)
    {
        for(int k=1;k<=n;k++)
        {
            int first=a[0];
        for(int j=0;j<a[1].length;j++)
        {
            
            


        }
        }



    }

}