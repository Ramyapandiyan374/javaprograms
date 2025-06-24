import java.util.*;
class LinearSearch{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        System.out.print("Enetr the key elements:");
        int n=sc.nextInt();
        int []a={10,40,60,80};
        String res=solve(a,n);
        System.out.println(res);

    }
    public static String solve(int []a,int key)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            return "Present";

        }
            return "Not present";


    }
}
