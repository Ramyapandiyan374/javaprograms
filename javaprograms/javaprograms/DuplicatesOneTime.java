import java.util.*;
class DuplcatesOneTime
{
    static Scanner sc=new Scanner(System.in);

    public static void main(String[]args)
    {
        String s1="ramyaa";
        solve(s1);
                 
    }
    public static void solve(String s1)
    {
        char []a=s1.toCharArray();
        String ans="";
        for(int i=0;i<a.length;i++)
        {
            
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    ans+=a[j];

                }
                
        }
    

        
        }
        System.out.println(ans.charAt(0));
    }
}

        

        

    
            
           

        







        
        
