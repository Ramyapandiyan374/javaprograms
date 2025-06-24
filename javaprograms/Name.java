class Name
{
    public static void main(String[]args)throws Exception
    {
        int n=9;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==n-1  || i==j && i>=n/2 || i==0 || i+j==n-1 && i<=n/2)
                {
                    System.out.print("B ");
                }
                else
                {
                    System.out.print("  ");
                }
                
                Thread.sleep(30);
            }
            

            System.out.print(" ");
            for(int k=0;k<n;k++)
            {
                if(k==0 || i==0 || i==n/2 || k==n-1)
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
            for(int e=0;e<n;e++)
            {
                if(e==0 || i==e || e==n-1)
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
            for(int h=0;h<n;h++)
            {
                if(h==0 || i==n-1 || h==n-1)
                {
                    System.out.print("U ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.print(" ");
            for(int b=0;b<n;b++)
            {
                if(b==0 || b==n-1 || i==b && i<=n/2 || i+b==n-1 && i<=n/2)
                {
                    System.out.print("M ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.print(" ");
            for(int g=0;g<n;g++)
            {
                if(g==0 || g==n-1 || i==0 || i==n/2)
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
            for(int d=0;d<n;d++)
            {
                if(i==0 || d==n/2)
                {
                    System.out.print("T ");
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
                if(m==0 || m==n-1 || i==n/2)
                {
                    System.out.print("H ");
                }
                else
                {
                    System.out.print("  ");
                }
                Thread.sleep(30);
            }
            System.out.print(" ");
            for(int c=0;c<n;c++)
            {
                if(i==0 || i==n-1 || c==n/2)
                {
                    System.out.print("I ");
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