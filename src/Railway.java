import java.util.*;
public class Railway
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("            RAILWAY BOOKING SYSTEM     ");
        System.out.println("                   ");
        System.out.println("1. Book railway tickets ");
        System.out.println("                   ");
        System.out.println("2. Cancel tickets");
        System.out.println("                   ");
        System.out.println("PLEASE ENTER YOUR CHOICE");
        int oct = sc.nextInt();

        if(oct == 1){
            System.out.println("                   ");
            System.out.println("RAILWAY BOOKING SYSTEM");
            System.out.println("                   ");

            System.out.println("  Enter your age");
            int age = sc.nextInt();


            System.out.println("                   ");

            System.out.println("  Enter your name");
            String name = sc.next();


            System.out.println("                   ");

            System.out.println(" Enter number of seats to be booked");
            int tickets = sc.nextInt();

            System.out.println("                   ");

            System.out.println("   Choose type of seat you want to book");
            System.out.println("   1. AC First Class  (Rs 2000 per seat)");
            System.out.println("   2. AC Second tier  (Rs 1500 per seat)");
            System.out.println("   3. AC Third tier   (Rs 1000 per seat)");
            System.out.println("   4. Sleeper Class   (Rs 600 per seat )");
            System.out.println("   5. AC chair Class  (Rs 800 per seat )");
            System.out.println("   6. Second sitting  (Rs 400 per seat )");
            System.out.println("                   ");

            System.out.println("Enter which type of seat you want to be booked  (PLZ choose between 1-6)");
            int type = sc.nextInt();
            switch (type){
                case 1:
                    System.out.println("Your AC first class has been booked");
                    System.out.println("Your Total is Rs "+(2000*tickets));
                    break;
                case 2:
                    System.out.println("Your AC second class has been booked");
                    System.out.println("Your Total is Rs "+(1500*tickets));
                    break;
                case 3:
                    System.out.println("Your AC Third class has been booked");
                    System.out.println("Your Total is Rs "+(1000*tickets));
                    break;
                case 4:
                    System.out.println("Your Sleeper Class has been booked");
                    System.out.println("Your Total is Rs "+(600*tickets));
                    break;
                case 5:
                    System.out.println("Your AC chair class has been booked");
                    System.out.println("Your Total is Rs "+(800*tickets));
                    break;
                case 6:
                    System.out.println("Your Second sitting has been booked");
                    System.out.println("Your Total is Rs "+(400*tickets));
                    break;
                default:
                    System.out.println("Please choose between option 1-6");
                    break;
            }
            System.out.println("                   ");
            System.out.println("PLEASE TYPE 123 TO BOOK YOUR TICKETS ");
            int code  = sc.nextInt();

            if( code == 123) {
                System.out.println("DETAILS OF YOUR BOOKING");
                System.out.println("                   ");

                System.out.println("   YOUR NAME IS "+name);
                System.out.println("                   ");

                System.out.println("   YOUR AGE IS  "+age);
                System.out.println("                   ");

                System.out.println("   YOUR BOOKING REFERENCE NO. IS 1234  ");

                System.out.println("  Use your booking reference at platform to get hard copy of your ticket  ");

                System.out.println("                   ");
                System.out.println("   THANK YOU FOR BOOKING TROUGH US       ");







            }
            else {
                System.out.println("YOU ARE INCORRECT USER OR A ROBOT THE PAGE WILL BR STOPPED");
            }
        }
        else if (oct == 2){
            System.out.println("-----------------");
            System.out.println("RAILWAY BOOKING SYSTEM");
            System.out.println("                   ");
            System.out.println("Enter your name");
            String name2 = sc.next();

            System.out.println("                   ");

            System.out.println("Enter your age");
            int awe = sc.nextInt();

            System.out.println("                   ");
            System.out.println("Enter your booking reference no. To cancel tickets");
            int ane = sc.nextInt();
            if(ane == 1234){
                System.out.println("Your name is "+name2);
                System.out.println("                   ");
                System.out.println("Your age is "+awe);
                System.out.println("                   ");
                System.out.println("Your booking reference no. is "+ane);
                System.out.println("                   ");
                System.out.println("Your tickets will be cancelled");
                System.out.println("Your money will be debited to your account within 24 hrs                   ");
            }
            else{
                System.out.println("Please enter valid booking ref no.    ");
            }

        }
        else{
            System.out.println(" Enter valid choice:");
        }
    }
}
