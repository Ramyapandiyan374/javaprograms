import java.util.*;
class CopyArrayElements
{
    public static void solve(int[][]a)
    {
        int [][]res=new int[a.length][];
        for(int i=0;i<a.length;i++)
        {
            res[i]=new int[a[i].length];
            for(int j=0,m=a[i].length-1;j<res[i].length;j++,m--)
            {
                res[i][j]=a[i][m];
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
  
        }
          }
    public static void main(String[]args)
    {
        int [][]a={
            {2,3,8,1},
            {4,3},
            {1,6,4,3,2},
        };
        solve(a);
    }
}