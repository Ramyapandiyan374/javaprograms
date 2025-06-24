class JvaScript{
    public static void main(String []args)
    {
        String s1="javascript";
        solve(s1);
        
    }
    public static void solve(String s){
        char []a=s.toCharArray();
        String n="";
        int n=3;
        for(int k=1;k<=n;k++){
            char first=a[3];
            for(int i=0;i<a.length-1;i++){
                a[i]=a[i+1];
            }
            a[a.length-1]=first;
            n=

    }
}