import java.util.*;
class Spiral
{
    public static void main(String[]args)
    {
        int [][]a={{10,20,30,40,50},{20,30,40,50,60},{30,40,50,60,70},{50,60,70,80,90},
        {10,40,50,70,80},};
        solve(a);
    }
    public static void solve(int [][]a)
    {

        int n=5;
        int left=0,right=n-1,top=0,bottom=n-1;
        while(left<=right && top<=bottom)
        {
        for(int i=left;i<=right;i++)
        {
            System.out.print(a[top][i]+" ");
        }
        top++;
        System.out.println();
        for(int i=top;i<=bottom;i++)
        {
            System.out.print(a[i][right]+" ");
        }
        right--;
        System.out.println();
        for(int i=right;i>=left;i--)
        {
            System.out.print(a[bottom][i]+" ");
        }
        bottom--;
        System.out.println();
        for(int i=bottom;i>=top;i--)
        {
            System.out.print(a[i][left]+" ");
        }
        left++;
        System.out.println();
        }
    }
}