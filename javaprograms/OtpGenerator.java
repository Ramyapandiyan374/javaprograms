class OtpGenerator
{
    public static void main(String[]args)throws Exception
    {
        System.out.println("Otp Generator...");
        Thread.sleep(3000);
        int sys_otp=(int)(Math.random()*66677+77778);
        System.out.println(sys_otp);
    }
}