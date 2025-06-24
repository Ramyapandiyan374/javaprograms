import java.util.*;
class PrimeInArrays{
    public static void main(String []args)
    {
        int []a={1,5,7,9,11};
        for(int i=0;i<a.length;i++)
        {
            if(solve(a[i]))
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    public static boolean solve(int num)
    {
        if(num==0 || num==1)
        return false;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            return false;
        }
        return true;
    }
}