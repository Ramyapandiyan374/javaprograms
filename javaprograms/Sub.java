class Sub
{
    public static void main(String []args)
    {
        String s="abcdefabcb";
        System.out.println(s);
        String longeststring="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String temp=s.substring(i,j+1);
                if(!duplicates(temp))
                {
                    if(temp.length()>longeststring.length())
                    longeststring=temp;
                }
            }
        }
        System.out.println("longest substring:"+longeststring);
        System.out.println("length:"+longeststring.length());
    }
    public static boolean duplicates(String s)
    {
        char []a=s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                return true;


            }
        }
        return false;
    }
}