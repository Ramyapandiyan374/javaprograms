import java.util.Scanner;
class Swiggy
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)throws Exception
    {
        long reg_phone_no=9876543210L;
        System.out.print("\t\t\tEnter reg_phone_no:");
        long user_phone_no=sc.nextLong();
        if(user_phone_no==reg_phone_no)
        {
            System.out.println("Otp Generating...");
            Thread.sleep(3000);
            int sys_otp=(int)(Math.random()*1000+1000);
            System.out.println(sys_otp);
            System.out.print("\t\t\tEnter the otp:");
            int user_entered_otp=sc.nextInt();
            if(sys_otp==user_entered_otp)
            {
                Thread.sleep(3000);
                System.out.println("\t\t\tOtp Verified");
                boolean red=true;
                do
                {
                    Thread.sleep(2000);
                    System.out.println("\t\t\tList of Hotels:");
                    System.out.println("\t\t\t--------------");
                    System.out.println("\t\t\t1.Buhari Hotel\n\t\t\t2.A2B\n\t\t\t3.S.S Hydrabad");
                    System.out.print("\t\tSelect the your choice:");
                    int hotel_selection=sc.nextInt();
                    switch (hotel_selection)
                    {
                        case 1:
                            {
                            System.out.println("\t\t\tWelcome to Buhari Hotel");
                            Thread.sleep(1000);
                            System.out.println("\t\t\tSelect the menu");
                            System.out.println("\t\t\t--------------");
                            System.out.println("\t\t1.Chicken Biryani\n\t\t2.Mutton Biryani\n\t\t3.Prawn Biryani");
                            System.out.print("\t\tselect your food choice:");
                            int food_selection=sc.nextInt();
                            switch(food_selection)
                            {
                                case 1:
                                    {
                                    double price=150;
                                    System.out.println("\t\t\tThe price of chicken biryani is"+price);
                                    System.out.print("\t\tEnter the quantity:");
                                    int quantity=sc.nextInt();
                                    double sys_bill=quantity*price;
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\tThe total bill is "+sys_bill);
                                    Thread.sleep(500);
                                    System.out.println("\t\t\tSelect the payment mode");
                                    System.out.println("\t\t\t1.Google pay\n\t\t\t2.Phone pay");
                                    int payment_mode=sc.nextInt();
                                    int user_pin=1234;
                                    switch (payment_mode)
                                    {
                                        case 1:{
                                            System.out.print("\t\t\tEnter the mobile pin:");
                                            int mpin=sc.nextInt();
                                            if(user_pin==mpin)
                                            {
                                                System.out.print("\t\t\tEnter the bill amount:");
                                                int user_bill=sc.nextInt();
                                                if(user_bill==sys_bill)
                                                {
                                                    Thread.sleep(2000);
                                                    System.out.println("\t\t\tOrder placed");
                                                    System.out.println("\t\t\tFood will be delivered within 10 minutes");
                                                }
                                                else
                                                {
                                                    System.out.println("\t\t\tOrder failed");
                                                    System.out.println("\t\tThank you for visting Buhari Hotel");
                                                }
                                                
                                            }
                                            else
                                            {
                                                System.out.println("\t\t\tWrong mpin Please try again later");
                                            }
                                            break;}
                                            case 2:{
                                                System.out.print("\t\t\tEnter the mpin:");
                                                int mpin=sc.nextInt();
                                                if(mpin==user_pin)
                                                {
                                                    System.out.print("\t\t\tEnter the bill amount:");
                                                    int user_bill=sc.nextInt();
                                                    if(user_bill==sys_bill)
                                                    {
                                                        Thread.sleep(3000);
                                                        System.out.println("\t\t\torder placed");
                                                        System.out.println("\t\t\tThe food will be delivered within 10 minutes");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\tOrder failed");
                                                        System.out.println("\t\tThank you for visting Buhari Hotel");
                                                    }
                                                }
                                                else
                                                System.out.println("\t\tWrong pin please try again later");
                                                break;}
                                            }
                                break;}
                                     case 2:{
                                        double price=300;
                                        System.out.println("\t\t\tThe price of the Mutton briyani is"+price);
                                        System.out.print("\t\t\tEnter the quantity:");
                                        int quantity=sc.nextInt();
                                        double sys_bill=quantity*price;
                                        Thread.sleep(1000);
                                        System.out.println("\t\t\tThe total bill is"+sys_bill);
                                        System.out.println("\t\t\tSelect the payment mode");
                                        Thread.sleep(500);
                                        System.out.println("\t\t1.Google pay\n\t\t2.Phone pay");
                                        int payment_mode=sc.nextInt();
                                        int user_pin=1234;
                                        switch (payment_mode)
                                    {
                                        case 1:{
                                            System.out.print("\t\t\tEnter the mobile pin:");
                                            int mpin=sc.nextInt();
                                            if(user_pin==mpin)
                                            {
                                                System.out.print("\t\t\tEnter the bill amount:");
                                                int user_bill=sc.nextInt();
                                                if(user_bill==sys_bill)
                                                {
                                                    System.out.println("\t\t\tOrder placed");
                                                    System.out.println("\t\tThe food will be delivered within 10 minutes");
                                                }
                                                else
                                                {
                                                    System.out.println("\t\t order failed");
                                                    System.out.println("\t\tThank you for visting Buhari Hotel");
                                                }
                                                
                                            }
                                            else
                                            {
                                                System.out.println("\t\tWrong mpin Please try again later");
                                            }
                                            break;}
                                            case 2:{
                                                System.out.print("\t\tEnter the mpin:");
                                                int mpin=sc.nextInt();
                                                if(mpin==user_pin)
                                                {
                                                    System.out.print("\t\t\tEnter the bill amount:");
                                                    int user_bill=sc.nextInt();
                                                    if(user_bill==sys_bill)
                                                    {
                                                        System.out.println("\t\torder placed");
                                                        System.out.println("\t\tThe food will be delivered within 15 minutes");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\tOrder failed");
                                                        System.out.println("\t\tThank you for visting Buhari Hotel");
                                                    }
                                                }
                                                else
                                                System.out.println("\t\tWrong pin please try again later");
                                                break;}
                                            }
                                    break;}
                                     case 3:{
                                        double price=380;
                                        System.out.println("\t\t\tThe price of prawn briyani is "+price);
                                        System.out.print("\t\t\tEnter the quantity:");
                                        int quantity=sc.nextInt();
                                        double sys_bill=quantity*price;
                                        Thread.sleep(1000);
                                        System.out.println("\t\t\tThe total bill is"+sys_bill);
                                        System.out.println("\t\t\tSelect the payment mode");
                                        Thread.sleep(500);
                                        System.out.println("\t\t\t1.Google pay\n\t\t\t2.Phone pay");
                                        int payment_mode=sc.nextInt();
                                        int user_pin=1234;
                                        switch (payment_mode)
                                    {
                                        case 1:{
                                            System.out.print("\t\tEnter the mobile pin:");
                                            int mpin=sc.nextInt();
                                            if(user_pin==mpin)
                                            {
                                                System.out.print("\t\tEnter the bill amount:");
                                                int user_bill=sc.nextInt();
                                                if(user_bill==sys_bill)
                                                {
                                                    System.out.println("\t\tOrder placed");
                                                    System.out.println("\t\tThe food will be delivered within 20 minutes");
                                                }
                                                else
                                                {
                                                    System.out.println("\t\t order failed");
                                                    System.out.println("\t\tThank you for visting Buhari Hotel");
                                                }
                                                
                                            }
                                            else
                                            {
                                                System.out.println("\t\tWrong mpin Please try again later");
                                            }
                                            break;}
                                            case 2:{
                                                System.out.print("\t\tEnter the mpin:");
                                                int mpin=sc.nextInt();
                                                if(mpin==user_pin)
                                                {
                                                    System.out.print("\t\tEnter the bill amount:");
                                                    int user_bill=sc.nextInt();
                                                    if(user_bill==sys_bill)
                                                    {
                                                        System.out.println("\t\torder placed");
                                                        System.out.println("\t\tThe food will be delivered within 15 minutes");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\tOrder failed");
                                                        System.out.println("\t\tThank you for visting Buhari Hotel");
                                                    }
                                                }
                                                else
                                                System.out.println("\t\tWrong pin please try again later");
                                                break;}
                                            }
                                    break;}
                                    default:
                                        System.out.println("\t\tWrong food selection");
                                    }
                            break;} 
                            case 2:
                            {
                            System.out.println("\t\t\tWelcome to A2B Hotel");
                            Thread.sleep(1000);
                            System.out.println("\t\t\tSelect the menu");
                            System.out.println("\t\t\t----------------");
                            System.out.println("\t\t\t1.Idli\n\t\t\t2.Masala Dosa");
                            System.out.print("\t\t\tselect your food choice:");
                            int food_selection=sc.nextInt();
                            switch(food_selection)
                            {
                                case 1:
                                    {
                                    double price=40;
                                    System.out.println("\t\t\tThe price of Idli is"+price);
                                    System.out.print("\t\t\tEnter the quantity:");
                                    int quantity=sc.nextInt();
                                    double sys_bill=quantity*price;
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\tThe total bill is "+sys_bill);
                                    System.out.println("\t\tSelect the payment mode");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t\t1.Google pay\n\t\t\t2.Phone pay");
                                    int payment_mode=sc.nextInt();
                                    int user_pin=1234;
                                    switch (payment_mode)
                                    {
                                        case 1:{
                                            System.out.print("\t\tEnter the mobile pin:");
                                            int mpin=sc.nextInt();
                                            if(user_pin==mpin)
                                            {
                                                System.out.print("\t\tEnter the bill amount:");
                                                int user_bill=sc.nextInt();
                                                if(user_bill==sys_bill)
                                                {
                                                    System.out.println("\t\tOrder placed");
                                                    System.out.println("\t\tThe food will delivered within 15 minutes");
                                                }
                                                else
                                                {
                                                    System.out.println("\t\tNo order failed");
                                                    System.out.println("\t\tThank you for visting Buhari Hotel");
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\tWrong mpin Please try again later");
                                            }
                                            break;}
                                            case 2:{
                                                System.out.print("\t\tEnter the mpin:");
                                                int mpin=sc.nextInt();
                                                if(mpin==user_pin)
                                                {
                                                    System.out.print("\t\tEnter the bill amount:");
                                                    int user_bill=sc.nextInt();
                                                    if(user_bill==sys_bill)
                                                    {
                                                        System.out.println("\t\torder placed");
                                                        System.out.println("\t\tThe food will be deliverd within 15 minutes");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\tOrder failed");
                                                        System.out.println("\t\tThank you for visting A2B");
                                                    
                                                    }
                                                }
                                                else
                                                System.out.println("\t\tWrong pin please try again later");
                                                break;}
                                            }
                                            break;}
                                        case 2:
                                        {
                                        double price=80;
                                        System.out.println("\t\tThe price of Masala dosa is"+price);
                                        System.out.print("\t\tEnter the quantity:");
                                        int quantity=sc.nextInt();
                                        double sys_bill=quantity*price;
                                        Thread.sleep(1000);
                                        System.out.println("\t\tThe total bill is"+sys_bill);
                                        System.out.println("\t\tSelect the payment mode");
                                        Thread.sleep(500);
                                        System.out.println("\t\t1.Google pay\n\t\t2.Phone pay");
                                        int payment_mode=sc.nextInt();
                                        int user_pin=1234;
                                        switch (payment_mode)
                                    {
                                        case 1:{
                                            System.out.print("\t\tEnter the mobile pin:");
                                            int mpin=sc.nextInt();
                                            if(user_pin==mpin)
                                            {
                                                System.out.print("\t\tEnter the bill amount:");
                                                int user_bill=sc.nextInt();
                                                if(user_bill==sys_bill)
                                                {
                                                    System.out.println("\t\tOrder placed");
                                                    System.out.println("\t\tThe food will be deliverd within 15 minutes");
                                                }
                                                else
                                                {
                                                    System.out.println("\t\tNo order failed");
                                                    System.out.println("\t\tThank you for visting A2B");
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\tWrong mpin Please try again later");
                                            }
                                            break;}
                                            case 2:{
                                                System.out.print("\t\tEnter the mpin:");
                                                int mpin=sc.nextInt();
                                                if(mpin==user_pin)
                                                {
                                                    System.out.print("\t\tEnter the bill amount:");
                                                    int user_bill=sc.nextInt();
                                                    if(user_bill==sys_bill)
                                                    {
                                                        System.out.println("\t\torder placed");
                                                        System.out.println("\t\tThe food will be deliverd within 30 minutes");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\tOrder failed");
                                                        System.out.println("\t\tThank you for visting A2B");
                                                    }
                                                }
                                                else
                                                System.out.println("\t\tWrong pin please try again later");
                                                break;}
                                            }
                                    break;}
                                }
                            break;}
                            case 3:
                            {
                            System.out.println("\t\t\tWelcome to S.S Hydrabad Hotel");
                            Thread.sleep(2000);
                            System.out.println("\t\t\tSelect the menu");
                            System.out.println("\t\t\t---------------");
                            System.out.println("\t\t\t1.Hydrabad chicken biryani\n\t\t\t2.Haleem");
                            System.out.print("\t\tselect your food choice:");
                            int food_selection=sc.nextInt();
                            switch(food_selection)
                            {
                                case 1:
                                    {
                                    double price=300;
                                    System.out.println("\t\t\t\tThe price of Hydrabad chicken biryani is"+price);
                                    System.out.print("\t\t\t the quantity:");
                                    int quantity=sc.nextInt();
                                    double sys_bill=quantity*price;
                                    Thread.sleep(1000);
                                    System.out.println("\t\t\tThe total bill is "+sys_bill);
                                    System.out.println("\t\t\tSelect the payment mode");
                                    Thread.sleep(500);
                                    System.out.println("\t\t\t1.Google pay\n\t\t\t2.Phone pay");
                                    int payment_mode=sc.nextInt();
                                    int user_pin=1234;
                                    switch (payment_mode)
                                    {
                                        case 1:{
                                            System.out.print("\t\tEnter the mobile pin:");
                                            int mpin=sc.nextInt();
                                            if(user_pin==mpin)
                                            {
                                                System.out.print("\t\tEnter the bill amount:");
                                                int user_bill=sc.nextInt();
                                                if(user_bill==sys_bill)
                                                {
                                                    System.out.println("\t\t\tOrder placed");
                                                    System.out.println("\t\t\tThe food will be deliverd within 20 minutes");
                                                }
                                                else
                                                {
                                                    System.out.println("\t\t order failed");
                                                    System.out.println("\t\tThank you for visting S.S Hydrabad Hotel");
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\tWrong mpin Please try again later");
                                            }
                                            break;}
                                            case 2:{
                                                System.out.print("\t\tEnter the mpin:");
                                                int mpin=sc.nextInt();
                                                if(mpin==user_pin)
                                                {
                                                    System.out.print("\t\t\tEnter the bill amount:");
                                                    int user_bill=sc.nextInt();
                                                    if(user_bill==sys_bill)
                                                    {
                                                        System.out.println("\t\t\torder placed");
                                                        System.out.println("\t\t\tThe food will be deliverd within 30 minutes");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\tOrder failed");
                                                        System.out.println("\t\t\tThank you for visting S.S Hydrabad Hotel");
                                                    }
                                                }
                                                else
                                                System.out.println("\t\tWrong pin please try again later");
                                                break;}
                                            }
                                break;}
                                     case 2:{
                                        double price=350;
                                        System.out.println("\t\t\tThe price of Haleem is"+price);
                                        System.out.print("\t\t\tEnter the quantity:");
                                        int quantity=sc.nextInt();
                                        double sys_bill=quantity*price;
                                        Thread.sleep(1000);
                                        System.out.println("\t\t\tThe total bill is"+sys_bill);
                                        System.out.println("\t\t\tSelect the payment mode");
                                        Thread.sleep(500);
                                        System.out.println("\t\t\t1.Google pay\n\t\t\t2.Phone pay");
                                        int payment_mode=sc.nextInt();
                                        int user_pin=1234;
                                        switch (payment_mode)
                                    {
                                        case 1:{
                                            System.out.print("\tEnter the mobile pin:");
                                            int mpin=sc.nextInt();
                                            if(user_pin==mpin)
                                            {
                                                System.out.print("\t\t\tEnter the bill amount:");
                                                int user_bill=sc.nextInt();
                                                if(user_bill==sys_bill)
                                                {
                                                    System.out.println("\t\t\tOrder placed");
                                                    System.out.println("\t\t\tThe food will be deliverd within 25 minutes");
                                                }
                                                else
                                                {
                                                    System.out.println("\t\t order failed");
                                                    System.out.println("\t\tThank you for visting S.S Hydrabad Hotel");
                                                }
                                            }
                                            else
                                            {
                                                System.out.println("\t\tWrong mpin Please try again later");
                                            }
                                            break;}
                                            case 2:{
                                                System.out.print("\t\tEnter the mpin:");
                                                int mpin=sc.nextInt();
                                                if(mpin==user_pin)
                                                {
                                                    System.out.print("\t\t\tEnter the bill amount:");
                                                    int user_bill=sc.nextInt();
                                                    if(user_bill==sys_bill)
                                                    {
                                                        System.out.println("\t\t\torder placed");
                                                        System.out.println("\t\t\tThe food will be deliverd within 30 minutes");
                                                    }
                                                    else
                                                    {
                                                        System.out.println("\t\t\tOrder failed");
                                                        System.out.println("\t\t\tThank you for visting S.S Hydrabad Hotel");
                                                    }
                                                }
                                                    else
                                                        System.out.println("\t\tWrong pin please try again later");
                                                        break;}
                                            }
                                    break;}
                                     }
                                    break;}
                                    default:red=false;
                                        System.out.println("\t\t\tWrong Hotel Selection");
                                        break;
                                        }
                }
                    while(red);
            }
            else
            {
                Thread.sleep(3000);
                System.out.println("\t\t\tInvalid otp try again");
            }
        }
        else
        {
            Thread.sleep(1000);
            System.out.println("\t\t\tinvalid user phone number");
        }
    }
}
        
  
    

 

 