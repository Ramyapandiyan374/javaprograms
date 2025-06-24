import java.util.*;
class All
{
    public static void main(String []args)
    {
        int [][]a={{8,-3,81,20},{2,1,4,3,6},{8,1,3,1},{2,41,5},{16,3,4,164,26,-3},};
        for(int i=0;i<a.length;i++)
        {
            if(i==0)
        {
            System.out.println("Before sort:"+Arrays.toString(a[i]));
            bubbleSort(a[i]);
        }
            else if(i==1)
            {
            System.out.println("Before sort:"+Arrays.toString(a[i]));
            selectionSort(a[i]);
            }
            else if(i==2)
            {
             System.out.println("Before sort:"+Arrays.toString(a[i]));
            countingSort(a[i]);
            }
            else if(i==3)
            {
            System.out.println("Before sort:"+Arrays.toString(a[i]));
            insertionSort(a[i]);
            }
            else if(i==4)
            {
                System.out.println("Before sort:"+Arrays.toString(a[i]));
                divide(a[i],0,a[i].length-1);
                System.out.println("After sort:"+Arrays.toString(a[i]));

            

            }
                
            
        }
        
    }
    public static void bubbleSort(int []a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("After sort:"+Arrays.toString(a));
    }
    public static void selectionSort(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            int s=i;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]<a[s])
                s=j;
            }
            int temp=a[i];
            a[i]=a[s];
            a[s]=temp;
        }
        System.out.println("After sort:"+Arrays.toString(a));
    }
    public static void countingSort(int []a)
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            largest=Math.max(a[i],largest);
        }
        int []b=new int[largest+1];
        for(int i=0;i<a.length;i++)

        {
            b[a[i]]++;
        }
        for(int j=0,x=0;j<b.length;j++)
        {
            while(b[j]>0)
            {
                a[x++]=j;
                b[j]--;
            }
        }
        System.out.println("After sort:"+Arrays.toString(a));
    }
    public static void insertionSort(int []a)
    {

        for(int i=1;i<a.length;i++)
        {
            int left=i-1,right=a[i];
            while(left>=0 && right<a[left])
            {
                a[left+1]=a[left--];
            }
            a[left+1]=right;
        }
        System.out.println("After sort:"+Arrays.toString(a));
    }
    public static void divide(int []a,int l,int h)
    {
      if(l==h)
      return;
      int mid=(l+h)/2;
      divide(a,l,mid);
      divide(a,mid+1,h);
      merge(a,l,mid,h); 

    }
    public static void merge(int []a,int l,int mid,int h)
    {
        int left=l,right=mid+1;
        int k[]=new int[h-l+1];
        int x=0;
        while(left<=mid && right<=h)
        {
            if(a[left]<a[right])
            k[x++]=a[left++];
            else
            k[x++]=a[right++];
        }
        while(left<=mid)
        k[x++]=a[left++];
        while(right<=h)
        k[x++]=a[right++];
        x=0;
        for(int i=l;i<=h;i++)
        {
            a[i]=k[x++];
        }
            }

    }