import java.util.*;
class Transpose2D
{
    public static void main(String[]args)
    {
        int [][]a={{21,24,12},{16,44,32},{52,62,43},};
        
        for(int i=0;i<a.length;i++)
        {
            
            for(int j=0;j<a[i].length;j++)
            {
         
              a[i][j]=solve(a[i][j]);
              System.out.print(a[i][j]+" ");
            }
            System.out.println();
            
        }
    }
    public static int solve(int num)
    {
        int rev=0;
        while(num>0)
        {
            rev=rev*10+(num%10);
            num/=10;
        }
        return rev;
    }
    
}