import java.util.*;
class StockPrice
{
    public static void main(String[]args)
    {
        int[]a={7,1,5,3,6,4};
        solve(a);
    }
    public static void solve(int []a)
    {
        int max_profit=0,buying_price=a[0];
        for(int i=1;i<a.length;i++)
        {
            int profit=a[i]-buying_price;
            max_profit=Math.max(profit,max_profit);
            buying_price=Math.min(a[i],buying_price);
        }
        System.out.println(max_profit);
    }

}