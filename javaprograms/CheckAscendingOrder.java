import java.util.*;
class Dorasss{
    public static void main(String[]args)
    {
        int []a={10,20,30,80,50};
        System.out.println(Arrays.toString(a));
        boolean res=solve(a);
        if(res)
        System.out.println("It is present in ascending order");
        else
        System.out.println("It is present in descending order");

    }
    public static boolean solve(int []a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]>a[i+1])
            return false;
            
        }
        return true;
    }
}