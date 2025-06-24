import java.util.*;
class StringUpperLower{
    public static void main(String []args)
    {
        String s1="ABCdEf";
        solve(s1);

    }
    public static void solve(String s1)
    {
        char []a=s1.toCharArray();
        
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]>='A' && a[i]<='Z')
            {
                a[i]+=32;
                System.out.print(a[i]+" ");
            }
            else if(a[i]>='a' && a[i]<='z')
            {
                a[i]-=32;
                System.out.print(a[i]+" ");
            }
        }
        
        
    }
}