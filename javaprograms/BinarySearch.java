 import java.util.*;
class BinarySearch{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enetr the key elements:");
        int n=sc.nextInt();
        int []a={10,20,30,40,50,60,70,80};
        String res=solve(a,n);
        System.out.println(res);

    }
    public static String solve(int []a,int key)
    {
        int l=0,h=a.length-1;
        while(l<=h)
        {
            int  m=(l+h)/2;
                if(key==a[m])
                return "Present";
                else if(key<a[m])
                h=m-1;
                else if(key>a[m])
                l=m+1;
            
        }
        return "Not Present";
 
           }
 
}
       