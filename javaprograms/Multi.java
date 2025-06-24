class Multi{
    public static void main(String []args)
    {
        int [][]a={{3,4,2},{5,6,7},{1,3,4},};
        int [][]b={{2,3,4},{4,2,3},{1,2,3},};
        solve(a,b);
            
        
    }
    public static void solve(int [][]a,int [][]b)
    {
        int res[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
        {
            
            for(int j=0;j<b[0].length;j++)
            {
                res[i][j]=0;
                for(int k=0;k<a[i].length;k++)
                {
                    res[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(res[i][j]+" ");
                

            }
            
            
            System.out.println();       
        }
}
}