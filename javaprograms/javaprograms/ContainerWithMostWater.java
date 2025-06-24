import java.util.*;
class ContainerWithMostWater{
    public static void main(String[]args)
    {
        int []a={1,8,6,2,5,4,8,3,7};
        solve(a);
    }
    public static void solve(int []a)
    {
        int max_area=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                int length=Math.min(a[i],a[j]);
                int width=j-i;
                int area=length*width;
                max_area=Math.max(area,max_area);
                
                
            }
            
        }
        System.out.println(max_area);
    }
}