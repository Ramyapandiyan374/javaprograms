import java.util.*;
class Shifting0and1
{
    public static void main(String[]args)
    {
        int []a={1,0,1,1,0,1,0,0};
        solve(a);
    }
    public static void solve(int []a)
    {

        
        int left=0,right=a.length-1;
        while(left<right)
        {
            if(a[left]==1 && a[right]==0)
            {
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
            }
            else if(a[left]==0)
            left++;
            else if(a[right]==1)
            right--;

        }
        System.out.println(Arrays.toString(a));
    }
}