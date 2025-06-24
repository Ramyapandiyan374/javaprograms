import java.util.Arrays;
class BubbleSort 
{
    public static void main(String[]args)
    {
        int []a={10,50,60,30,5,9};
        System.out.println("Before Swap:"+Arrays.toString(a));
        bubbleSort(a);
        System.out.println("After Swap:"+Arrays.toString(a));
        
    }
        public static void bubbleSort(int []a)
        {
            for(int i=0;i<a.length-1;i++)
            {
                for(int j=0;j<a.length-1;j++)
                {
                    if(a[j]>a[j+1])
                    {
                        int temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                    }
                }
            }
            
        }
    
}