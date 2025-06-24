import java.util.Arrays;
class InsertionSort
{
    public static void main(String[]args)
    {
        int []a={10,50,70,6,5};
        System.out.println(Arrays.toString(a));
        for(int i=1;i<a.length;i++)
        {
            int right=a[i];
            int left=i-1;
            while(left>=0 && a[left]>right)
            {
                a[left+1]=a[left];
                left--;
            }
            a[left+1]=right;
            

        }
        System.out.println(Arrays.toString(a));
        
    }
}