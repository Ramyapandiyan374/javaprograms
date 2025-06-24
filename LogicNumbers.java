import java.util.Scanner;
class LogicNumbers
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String []args)throws Exception
    {
        int userid=1256567;
        long contact=9876543210l;
        int password=3333;
        String gender="Female";
        boolean red=true;
        do{
        System.out.println("Select the input:");
        System.out.println("1.Sign up\n2.Login\n3.Forget password\n4.exit");
        System.out.print("Choose your option:");
        int input=sc.nextInt();
        switch(input)
        {
            case 1:{
                System.out.print("Enter the userid:");
                int sys_userid=sc.nextInt();
                if(userid==sys_userid)
                {
                    System.out.println("This account is already exist");
                }
                else
                {
                    System.out.print("Enter the contact:");
                    long contact1=sc.nextLong();
                    System.out.print("Enter the password:");
                    int pass=sc.nextInt();
                    System.out.print("Enter the gender:");
                    String gender1=sc.next();
                    System.out.println("Suscessfully you have created an account");
                }

                break;}
                case 2:{
                    System.out.print("Enter the contact:");
                    long contact2=sc.nextLong();
                    if(contact==contact2)
                    {
                        System.out.print("Enetr the password:");
                        int password3=sc.nextInt();
                        if(password3==password)
                        {

                        
                        System.out.println("Select your chioce:");
                        System.out.println("1.Number programming\n2.Pattern programming\n3.Swiggy\n4.exit");
                        System.out.print("Select your choice:");
                        int choice=sc.nextInt();
                        boolean number=true;
                        do
                        {
                        switch(choice)
                        {
                            case 1:{
                                System.out.println("Number programming types");
                                System.out.println("1.Factorial\n2.Prime\n3.Largest of two\n4.Palindrome\n5.Exit");
                                System.out.print("Enter your choice:");
                                int choice2=sc.nextInt();
                                boolean types=true;
                                do
                                {
                                switch(choice2)
                                {
                                    case 1:{
                                        System.out.print("Enter the number:");
                                        int number2=sc.nextInt();
                                        factorial(number2);
                                        break;}
                                        case 2:{
                                            System.out.print("Enter the number:");
                                            int number1=sc.nextInt();
                                            prime(number1);
                                            break;}
                                            case 3:{
                                                System.out.print("Enter the number1:");
                                                int a=sc.nextInt();
                                                System.out.print("Enter the number2:");
                                                int b=sc.nextInt();
                                                largestOfTwo(a,b);
                                                break;}
                                                case 4:{
                                                    System.out.print("Enter the number:");
                                                    int number4=sc.nextInt();
                                                    palindrome(number4);
                                                    break;}
                                                    case 5:{
                                                        types=false;
                                                        break;}
                                    default:{
                                        System.out.println("Invalid choice");
                                        break;}
                                }
                                
                                break;}
                         
                                case 2:{
                                    System.out.println("NUmber of pattern programming types");
                                    System.out.println("1.Square\n2.Triangle\n3.Name\n4.Exit");
                                    System.out.print("Select your Pattern types:");
                                    int pattern=sc.nextInt();
                                
                                    switch(pattern)
                                    {
                                        case 1:{
                                            square(5);
                                            break;}
                                            case 2:{
                                                triangle(5);
                                                break;}
                                                case 3:{
                                                    name(5);
                                                    break;}
                                                    case 4:{
                                                        types=false;
                                                        break;}
                                        default:{
                                            System.out.println("Invalid pattern programming types");
                                            break;}
                                    }
                                    
                                    break;}
                                 }
                            while(types);

                                    case 3:{
                                        


    
    
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

                
                    Thread.sleep(2000);
                    System.out.println("\t\t\tList of Hotels:");
                    System.out.println("\t\t\t--------------");
                    System.out.println("\t\t\t1.Buhari Hotel\n\t\t\t2.A2B\n\t\t\t3.S.S Hydrabad\n\t\t\t4.Exit");
                    System.out.print("\t\tSelect the your choice:");
                    int hotel_selection=sc.nextInt();
                    boolean hotel=true;
                    do
                    {
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
                                    case 4:{
                                        hotel=false;
                                        break;}
                                    default:
                                        System.out.println("\t\t\tWrong Hotel Selection");
                                        break;
                                     }
                    }
                    while(hotel);
                
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
    

        
  
    

 

 

                                        break;}
                                        case 4:{
                                            number=false;
                                            break;
                                        }
                            default:{
                                System.out.println("Invalid choice");
                                break;}
                        }
                        }
                        while(number);
                        }
                        else
                        {
                            System.out.println("Incorrect password");
                            System.out.println("Forgetten password?");
                        }

                    }
                    else
                    {
                        System.out.println("Incorrect contact Number");
                    }
                    break;}
                    case 3:{
                        System.out.print("Enter your registerd number:");
                        long registered_number=sc.nextLong();
                        if(registered_number==contact)
                        {
                            System.out.println("Otp sent your registered mobile phone");
                            Thread.sleep(3000);
                            int sys_otp=(int)(Math.random()*9999+9999);
                            System.out.println(sys_otp);
                            System.out.println("Enter the otp");
                            int user_otp=sc.nextInt();
                            if(user_otp==sys_otp)
                            {
                            System.out.print("Enter your new password:");
                            int password6=sc.nextInt();
                            password=password6;
                            System.out.println("Password changed");

                            }
                            else
                            {
                                System.out.println("Invalid otp");
                                System.out.println("Please try again later");
                            }
                            
                            
                        }
                        else
                        {
                            System.out.println("invalid registerd number");
                        }
                        break;}
                        case 4:{
                            red=false;
                            break;}
                    
            default:{
                System.out.println("Invalid input ");
                break;}
        }
        }
        while(red);
        
    }

    public static void factorial(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact*=i;
        }
        System.out.println(fact);

    }
    public static void prime(int num)
    {
        if(num==1 || num==0)
        {
            System.out.println("Neither composite nor prime");
        }
        else
        {
           boolean is_prime=true;
           for(int i=2;i<num;i++)
           {
            if(num%i==0)
            {
                is_prime=false;
                break;
            }
           }
           if(is_prime)
        System.out.println("Prime number");
        else
        System.out.println("Composite number");

        }
        
    }

    
    public static void largestOfTwo(int a,int b)
    {
        int res=(a>b)?a:b;
        System.out.println(res);

    }
    public static void palindrome(int num)
    {
        int temp=num;
        int rev=0;
        while(num>0)
        {
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println((temp==rev?"Palindrome":"Not palindrome"));

    }
    public static void square(int n )
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j==0 || i==0 || j==n-1 || i==n-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }

    }
    public static void triangle(int n)
    {
      for (int i = 0; i < n; i++) {
 for (int j = 0; j < n; j++) {
 if (i + j >= n - 1)
 System.out.print(i + 1 + " ");
 else
 System.out.print(" ");
 }
for (int j = 0; j < n; j++) {
 if (i > j)
 System.out.print(i + 1 + " ");
 else
 System.out.print(" ");
 }
System.out.println();
 }
 }  
    
       
       public static void name(int n)
     {
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
                
            }
            System.out.println();
        }

    }
}

