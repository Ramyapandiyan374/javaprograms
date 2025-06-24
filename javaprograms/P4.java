class P4
{
    public static void main(String[]args)
    {
    int year=2020;
    boolean isleapyear=(year%4==0 &&
     year%100!=0) || year%400==0;
    System.out.println(year+"isleapyear?"+isleapyear);
    }

}