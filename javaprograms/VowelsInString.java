import java.util.*;
class Dorassss
{
    public static void main(String []args)
    {
        String s="abceutou";
        solve(s);
    }
    public static void solve(String s)
    {
        char []a=s.toCharArray();
        String vowel="";
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u')
            {
               vowel+=a[i];
            }
        }
        System.out.println("vowels present in the string:"+vowel
        );
    }
}
