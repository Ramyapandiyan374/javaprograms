class Appa
{
    public static void main(String[]args)throws Exception
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==0 || j==n-1 && i<=n/2 || i==n/2)
                {
                    System.out.print("P ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.print(" ");
            for(int e=0;e<n;e++)
            {
                if(e==0 || i==0 || i==n/2 || e==n-1)
                {
                    System.out.print("A ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.print(" ");
            for(int h=0;h<n;h++)
            {
                if(h==0 || i==h || h==n-1)
                {
                    System.out.print("N ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.print(" ");
            for(int u=0;u<n;u++)
            {
                if(i==0 || u==0 || i==n-1 || u==n-1)
                {
                    System.out.print("D ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.print(" ");
            for(int d=0;d<n;d++)
            {
                if(i==0 || i==n-1 || d==n/2)
                {
                    System.out.print("I ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.print(" ");
            for(int s=0;s<n;s++)
            {
                if(i+s==n-1 || i==s && i<=n/2)
                {
                    System.out.print("Y ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.print(" ");
            for(int v=0;v<n;v++)
            {
                if(i==0 || v==0 || v==n-1 || i==n/2)
                {
                    System.out.print("A ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            
            System.out.print(" ");
            for(int m=0;m<n;m++)
            {
                if(m==0 || m==n-1 || i==m)
                {
                    System.out.print("N ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.println();
        }
    }
}