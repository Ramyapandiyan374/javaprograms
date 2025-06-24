class Dorasss{
    public static void main(String []args)
    {
       int []a={10,2,4,2,3,5,7,5};
       solve(a);
    }
    public static void solve(int []a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==Integer.MIN_VALUE)
            continue;
            int count=1;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    a[j]=Integer.MIN_VALUE;
                }
            
            }
            System.out.println(a[i]+" present "+count+" times ");
        }
    }
}