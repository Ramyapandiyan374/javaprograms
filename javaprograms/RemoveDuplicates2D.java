import java.util.*;
class RemoveDuplicates2D
{
    public static void main(String[]args)
    {
        int [][]a={{8,2,8,1,4},{2,1,2,2,6},{4,1,3},};
        for(int i=0;i<a.length;i++)
        {
            a[i]=removeDuplicates2D(a[i]);
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static int[] removeDuplicates2D(int []a)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==Integer.MIN_VALUE)
            continue;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    a[j]=Integer.MIN_VALUE;
                }                
                                
            }

        }
        int res[]=new int[a.length-count];
        for(int i=0,x=0;i<a.length;i++)
        {
            if(a[i]!=Integer.MIN_VALUE)
            {
                res[x++]=a[i];
            }
        }
        return res;

    }
    

}
