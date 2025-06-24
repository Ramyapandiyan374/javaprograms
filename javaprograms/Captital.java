import java.util.Scanner;
class Captital 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)
    {
        String s="I Can DO Anything";
        String []a=s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0)
            {
                a[i]=lower(a[i]);
                System.out.print(a[i]+" ");
               
            }
            else
            {
           a[i]= upper(a[i]);
            System.out.print(a[i]+" ");
         
            }
        }
        
    }
    public static String lower(String s)
    {
        char []c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            if(c[0]>='A' && c[0]<='Z')
            {
                c[i]+=32;
                break;
            }
        }
        return new String(c);
    }
    public static String upper(String s)
    {
        char[]b=s.toCharArray();

        for(int i=0;i<b.length;i++)
        {
            if(b[0]>='a' && b[0]<='z')
            {
                b[i]-=32;
                break;
            }
            
        }
        return new String(b);
    }
    
}