class Swap
{
    public static void main(String[]args)
    {
        System.out.println("\t\tBefore Swap");
        int a=10,b=20;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("\t\tAfter Swap");
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        
    }
}