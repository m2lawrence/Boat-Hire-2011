//* Mikes CCN Boat Hire assignment.*
import java.util.Scanner;
import java.util.Date;
import java.util.Random;
public class boatHire
{
  public static void mainBoatMenu()//My main boat menu code.
  {    
      System.out.println ("* Welcome to CCN Boat Hire automated reservation system. *");
      System.out.println (" ");
      System.out.println ();    
      System.out.println ("*-----------------MAIN MENU------------------*");
      System.out.println ("*                                            *");
      System.out.println ("*                                            *");
      System.out.println ("* Please select from the following options:  *");
      System.out.println ("*                                            *");
      System.out.println ("*                                            *");
      System.out.println ("*-- 1.  Boat Reservations.                   *");
      System.out.println ("*                                            *");
      System.out.println ("*-- 2.  Boat Availabilities.                 *");
      System.out.println ("*                                            *");
      System.out.println ("*-- 3.  Amend a booking for your boat.       *");
      System.out.println ("*                                            *");
      System.out.println ("*-- 4.  Exit with ticket confirmation.       *");
      System.out.println ("*                                            *");
      System.out.println ("*                                            *");
      System.out.print ("*---Please enter your numerical choice here: ");
  }
  
  public static void reservBoatMenu()//My boat reservations menu code.
  {
      System.out.println ("*-----------------------BOAT RESERVATIONS-------------------------*");
      System.out.println ("*                                                                 *");
      System.out.println ("*                                                                 *");
      System.out.println ("*   Please select from the following options:                     *");
      System.out.println ("*                                                                 *");
      System.out.println ("*                                                                 *");
      System.out.println ("*-- 1.  Book a Standard Boat at £50 per day plus £10 per person.  *");
      System.out.println ("*                                                                 *");
      System.out.println ("*-- 2.  Book a Luxury boat at £100 per day plus £20 per person.   *");
      System.out.println ("*                                                                 *");
      System.out.println ("*-- 3.  Return to Main Boat Menu.                                 *");
      System.out.println ("*                                                                 *");
      System.out.println ("*                                                                 *");
      System.out.print ("*-- Please enter your numerical choice here:  ");
  }
  
  public static void amendBoatMenu()//My availability boat menu code.
  {
      System.out.println ("*-------------AMEND A BOAT BOOKING--------------*");
      System.out.println ("*                                               *");
      System.out.println ("*                                               *");
      System.out.println ("*   Please select from the following options:   *");
      System.out.println ("*                                               *");
      System.out.println ("*                                               *");
      System.out.println ("*-- 1.  Amend a Standard Boat.                  *");
      System.out.println ("*                                               *");
      System.out.println ("*-- 2.  Amend a Luxury boat.                    *");
      System.out.println ("*                                               *");
      System.out.println ("*-- 3.  Return to Main Boat Menu                *");
      System.out.println ("*                                               *");
      System.out.println ("*                                               *");
      System.out.print ("*-- Please enter your numerical choice here:  ");
  }
  
  public static void main (String [] args)//My list of variables.
  {
    Scanner input = new Scanner (System.in); //Alows you to input info.
    String[] standBoat = new String [6]; //In this Standard Boat Array there are 6 boats. 
    String[] luxBoat = new String [4];   //In this Luxury Boat Array there are 4 boats.
    String menuBoatChoice; //ie: 1 = Boat reservations.
    String submenuBoatChoice; //ie: 1 = Standard boat ticket info.
    String newName;
    String answer;
    String menuBoatChoose;
    String exit;
    int standNo = 0; //Boat number.
    int luxNo = 0;  //Boat number.
    int[] standPeople = new int [6]; //Int array standPeople, then inside the array there are 6 new Int,so you can 
                                     //have people on the boat.
    int[] luxPeople = new int [4];
    int count = 0; // Tells the computer to count.
    int ticketFormat = 0; //Makes the ticket layout look great using: System.out.println("|"); 
    int boatAmend = 0;
    int tempStand = 0;
    int tempLux = 0;
    int n = 99999999; // 8 numbers for the ticket.
    int clear;
    Random r = new Random();
    Date d = new Date(); //Produces todays date for the ticket.
    //---------------------------------------------------------
      
    //-----Boat Age!!!--------
    int yearOfBirth;    //For the Boat Age of the person driving
    int thisYear = 2011;
    int age;
    String boat;
      
    //_____________________________________________________________
    //Generates a greetings message!
    for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
    String s;
    System.out.print(" What's your first name? ");
    s = input.next();
    //_____________________________________________________________
    //Asks the customer their Date Of Birth to make sure thay are at least 18 years old to hire a boat.
    for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
    System.out.print(" What's your year of birth '" + s + "'? ");
    yearOfBirth = input.nextInt();
    age = (thisYear - yearOfBirth);
    //_____________________________________________________________
    //Start of running programme:
     
    if (age <= 17)
    {
       for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
       System.out.println(" Greetings '" + s + "' but sorry please come back when you are over 18 years old ");
       System.out.print("to rent a boat from us, and have a nice day!");
    }
    else if(age >= 18)
    {
       do
       {
        //This person is over 18 years old and is classed as an adult so can have a boat & proceed to the main menu.
        for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines.
        System.out.println(" Greetings '" + s + "' happy booking today!");
        System.out.println();//This puts an empty line in, & is used for spacing my menu's.
        System.out.println();
        mainBoatMenu();//Bring up Main boat menu.
        menuBoatChoice = input.next();
        if (menuBoatChoice.equals ("1"))//Standars Boat reservations.
        {
           standNo = tempStand;
           luxNo = tempLux;
           for (clear = 0; clear <=36; clear++) {System.out.println (" ");} //Makes a clear screen with 36 blank lines.
           reservBoatMenu();//Bring up boat reservations menu.
           submenuBoatChoice = input.next();
           //Menu 1 *********************************************************
           if (submenuBoatChoice.equals ("1"))// Reserve a Standard boat.
           {  
             for (clear = 0; clear <=36; clear++) {System.out.println (" ");} //Makes a clear screen with 36 blank lines.
             System.out.print("Would you '" + s + "' like to book a Standard boat? Input Y or N: ");
             menuBoatChoose = input.next();
             while (menuBoatChoose.equalsIgnoreCase ("y") && standNo < 6)
             { 
                 for (clear = 0; clear <=36; clear++) {System.out.println (" ");} //Makes a clear screen with 36 blank lines.
                 System.out.print("Enter your full name for the ticket please '" + s + "': ");
                 standBoat[standNo] = input.nextLine();
                 standBoat[standNo] = input.nextLine();//Duplicate line to stop reading in next line.                               
                 for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                 System.out.print("How many people including yourself would you like to take on your boat '" + s + "'? ");
                 standPeople[standNo] = Integer.parseInt(input.next()); //Will now pick this up as an Int rather than a string, 
                 // & store the number in the array.
                 // Print the ticket out:
                 for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                 System.out.println();
                 System.out.println("|--------------CCN Boat Hire------Standard Ticket----------------"+ d +"--|");
                 System.out.println("|                                                                                              |");                                                          
                 System.out.print("|              Standard Boat Hire number S" + (standNo)  + " is booked by " + standBoat[standNo]);   
                 for (ticketFormat = 0; ticketFormat <= ( 37- standBoat[standNo].length()); ticketFormat++)
                 //(standNo) is the Boat Number inside the array upto 5 & [standNo] is the customers name booking the tickets 
                 //inside that standBoat standard array.
                 {
                   System.out.print(" ");
                 } //Stuff inside the for loop brackets{}.                
                 System.out.println("|"); //End of loop.
                 System.out.println("|                                                                                              |");
                 System.out.print("|              Your total boat cost is: £" + (50+10* standPeople[standNo]) + ".00p"); 
                 for (ticketFormat = 0; ticketFormat <=( 50- ".00p".length()); ticketFormat++)
                 //(standNo) is the Boat Number inside the array upto 5 & [standNo] is the customers name booking the tickets inside 
                 //that standBoat standard array.
                 {
                    System.out.print(" ");
                 } //This counts 87 spaces inside the for loop brackets{} & then puts an "|" at the end of the line/loop.                
                 System.out.println("|"); //End of loop.                    
                 System.out.println("|                                                                                              |");
                 System.out.println("|--------------Booking No: " + r.nextInt(n) + "------" + "Enjoy your cruise!------------------------------------|");
                 System.out.println();  
                 
                 standBoat[standNo] = standBoat[standNo++]; 
                 System.out.println("Would you like to book another Standard Boat '" + s + "'? Input Y or N: ");
                 menuBoatChoose = input.next();
                 if (menuBoatChoose.equalsIgnoreCase ("n"))
                 {
                    mainBoatMenu();//Bring up Main boat menu.
                 }
                 else if (standNo >=6)
                 {
                    System.out.println(" All our Standard boats have now been booked '" + s + "', thank you & please try again soon.");
                    System.out.println();
                    mainBoatMenu();//Bring up Main boat menu.
                 }
              }
           }
           //Menu 2******************************************************
           if (submenuBoatChoice.equals ("2"))// Reserve a Luxury boat ticket info.
           {
              for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
              System.out.print("Would you like to book a Luxury boat '" + s + "'? Input Y or N: ");
              menuBoatChoose = input.next();//Customer chooses Yes or No.
              while (menuBoatChoose.equalsIgnoreCase ("y") && luxNo < 4)
              {  
                    for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                    System.out.print("Enter your full name for the ticket please '" + s + "': ");
                    luxBoat[luxNo] = input.nextLine();
                    luxBoat[luxNo] = input.nextLine();//Duplicate line to stop reading in next line.                               
                    for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                    System.out.print("How many people including yourself would you like to take on your boat '" + s + "'? ");
                    luxPeople[luxNo] = Integer.parseInt(input.next()); //Will now pick this up as an Int rather than a string, 
                    //& store the number in the array.
                    // Print ticket...
                    for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                    System.out.println();
                    System.out.println("|**************CCN Boat Hire******Luxury Ticket******************"+ d +"**|");
                    System.out.println("|                                                                                              |");                                                          
                    System.out.print("|              Luxury Boat Hire Number  L" + (luxNo)  + " is booked by " + luxBoat[luxNo]);
                    for (ticketFormat =0; ticketFormat <= ( 38- luxBoat[luxNo].length()); ticketFormat++)
                    //(luxNo) is the Boat Number inside the array upto 4 & [luxNo] is the customers name booking the tickets inside 
                    //that luxBoat luxury array.
                    {
                       System.out.print(" ");
                    } //Stuff inside the for loop brackets{}.                
                    System.out.println("|"); //End of loop.
                    System.out.println("|                                                                                              |");
                    System.out.print("|              Your total boat cost is: £" + (100+20* luxPeople[luxNo]) + ".00p");
                    for (ticketFormat = 0; ticketFormat <=( 50- ".00p".length()); ticketFormat++)
                    {
                       System.out.print(" ");
                    } //Stuff inside the for loop brackets{}.                
                    System.out.println("|"); //End of loop.
                    System.out.println("|                                                                                              |");
                    System.out.println("|**************Booking No: " + r.nextInt(n) + " *****" + " Enjoy your cruise! **********************************|");
                    System.out.println();    
                    luxBoat[luxNo] = luxBoat[luxNo++];
                    System.out.println("Would you like to book another Luxury Boat '" + s + "'? Input Y or N: ");
                    menuBoatChoose = input.next();    
                    if (menuBoatChoose.equalsIgnoreCase ("n"))
                    {
                      System.out.println("Thank you for your boat booking '" + s + "'.");
                    }
                    else if (luxNo >=4)
                    {
                       System.out.println(" All our Luxury boats have now been booked '" + s + "', please try again later.");
                    }
              }
           }
           tempLux = luxNo;
           tempStand = standNo;
           }
           //**********************************************************
           else if (menuBoatChoice.equals  ("2"))//Mikes Boat availability menu.                    
           {
           for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
           System.out.println("    Here is our (BOAT MANIFEST) '" + s + "':");
           System.out.println("");                     
           System.out.println("-------------Standard boats---------------");
           for (standNo = 0; standNo <=5; standNo++)
           {
             System.out.println("Boat number " + "S" + (standNo)  + " is booked by " + standBoat[standNo]);
           }
           System.out.println();                     
           System.out.println("***************Luxury boats*****************");
           for (luxNo = 0; luxNo <=3; luxNo++)
           {
             System.out.println("Boat number " + "L" + (luxNo)  + " is booked by " + luxBoat[luxNo]);
           }                  
           System.out.println("");
           System.out.println("Please press any key now to return to Main Menu '" + s + "'.");
           exit = input.next();
           if (exit != "")
           {
           }
           }
           //****************************************************************                
           else if (menuBoatChoice.equals ("3"))//Amend a boat booking.
           {
           for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
           amendBoatMenu();// Bring up the boat Amendment menu.
           submenuBoatChoice = input.next();
           if (submenuBoatChoice.equals ("1"))//Amend Standard boat.
           {
              for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
              for (standNo = 0; standNo <=5; standNo++)
              {
                System.out.println("Boat number " + "S" + (standNo)  + " is booked by " + standBoat[standNo]);
              }
              System.out.println("------------------------------ Amend Standard Boats ------------------------------");
              System.out.println("");   
              System.out.println("Hello '" + s + "' please choose a boat number to amend from 0 to 5. ");
              System.out.println(" Please, do not amend a boat that has not been booked '" + s + "'. ");
              System.out.println(" Or press any other key '" + s + "' to exit this menu, thanks.");
              if (input.hasNextInt()) 
              {
                 boatAmend = input.nextInt();
                 while (boatAmend <6)
                 {   
                     for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                     standNo = boatAmend;
                     System.out.println(" Please amend your full name for this boat '" + s + "'.");
                     newName = input.nextLine();
                     newName = input.nextLine();
                     for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                     System.out.print("How many people including yourself would you like to take on your boat '" + s + "'? ");
                     standPeople[standNo] = Integer.parseInt(input.next()); //Will now pick this up as an Int rather than a string, 
                     //& store the number in the array.
                     for (boatAmend = 0; boatAmend <=5; boatAmend++)
                     {
                        standBoat[standNo] = newName;
                     }
                     System.out.println();
                     
                     // Print the ticket out:
                     for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                     System.out.println();
                     System.out.println("|--------------CCN Boat Hire------(Amended) Standard Ticket------"+ d +"--|");
                     System.out.println("|----------------------------------------------------------------------------------------------|");                                                          
                     System.out.print("|              Standard Boat Hire number S" + (standNo)  + " is booked by " + standBoat[standNo]);   
                     for (ticketFormat = 0; ticketFormat <= ( 37- standBoat[standNo].length()); ticketFormat++)
                     //(standNo) is the Boat Number inside the array upto 5 & [standNo] is the customers name booking the tickets 
                     //inside that standBoat standard array.
                     {
                         System.out.print(" ");
                        } //Stuff inside the for loop brackets{}.                
                     System.out.println("|"); //End of loop.
                     System.out.println("|                                                                                              |");
                     System.out.print("|              Your total boat cost is: £" + (50+10* standPeople[standNo]) + ".00p"); 
                     
                     for (ticketFormat = 0; ticketFormat <=( 50- ".00p".length()); ticketFormat++)
                     {
                         System.out.print(" ");
                        } //Stuff inside the for loop brackets{}.                
                     System.out.println("|"); //End of loop.                   
                     System.out.println("|----------------------------------------------------------------------------------------------|");
                     System.out.println("|--------------Booking No: " + r.nextInt(n) + "------" + "Enjoy your cruise!------------------------------------|");
                     System.out.println();  
                     System.out.println();
                     System.out.println(" To amend another boat '" + s + "' please choose from 0 to 5, or press any other key to exit.");    
                     if (input.hasNextInt())
                     {
                         boatAmend = input.nextInt(); 
                     }                   
                 }                    
              }
           }
           //***************************************************************
           if (submenuBoatChoice.equals ("2"))//Amend Luxury Boat
           {
              for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
              for (luxNo = 0; luxNo <=3; luxNo++)
              {
                System.out.println("Boat number " + "L" + (luxNo)  + " is booked by " + luxBoat[luxNo]);
              }
              System.out.println("******************************Amend Luxury Boats******************************************");
              System.out.println();   
              System.out.println(" Hello '" + s + "' please choose a boat number to amend from 0 to 3. ");
              System.out.println(" Please, do not amend a boat that has not been booked '" + s + "'. ");
              System.out.println(" Or press any other key '" + s + "' to exit this menu, thanks.");
              if (input.hasNextInt()) 
              {
                 boatAmend = input.nextInt();
                 while (boatAmend <6)
                 {
                    for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                    luxNo = boatAmend;
                    System.out.println(" Please amend your full name for this boat '" + s + "'.");
                    newName = input.nextLine();
                    newName = input.nextLine();
                    for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                    System.out.print("How many people including yourself would you like to take on your boat '" + s + "'? ");
                    luxPeople[luxNo] = Integer.parseInt(input.next()); //Will now pick this up as an Int rather than a string, 
                    //& store the number in the array.
                    for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                    System.out.print("How many people including yourself would you like to take on your boat '" + s + "'? ");
                    luxPeople[luxNo] = Integer.parseInt(input.next()); //Will now pick this up as an Int rather than a string, 
                    //& store the number in the array.
                    for (boatAmend =0 ; boatAmend <=5; boatAmend++)
                    {
                      luxBoat[luxNo] = newName;
                    }
                    System.out.println();
                    // Print ticket...
                    for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
                    System.out.println();
                    System.out.println("|**************CCN Boat Hire******(Amended) Luxury Ticket********"+ d +"**|");
                    System.out.println("|----------------------------------------------------------------------------------------------|");                                                          
                    System.out.print("|              Luxury Boat Hire Number   L" + (luxNo)  + " is booked by " + luxBoat[luxNo]);
                    for (ticketFormat =0; ticketFormat <= ( 37- luxBoat[luxNo].length()); ticketFormat++)
                    //(luxNo) is the Boat Number inside the array upto 4 & [luxNo] is the customers name booking the tickets 
                    //inside that luxBoat luxury array.
                    {
                       System.out.print(" ");
                    } //Stuff inside the for loop brackets{}.                
                    System.out.println("|"); //End of loop.
                    System.out.println("|                                                                                              |");
                    System.out.print("|              Your total boat cost is: £" + (100+20* luxPeople[luxNo]) + ".00p");
                    for (ticketFormat = 0; ticketFormat <=( 50- ".00p".length()); ticketFormat++)
                    {
                       System.out.print(" ");
                    } //Stuff inside the for loop brackets{}.                
                    System.out.println("|"); //End of loop.
                    System.out.println("|----------------------------------------------------------------------------------------------|");
                    System.out.println("|**************Booking No: " + r.nextInt(n) + " *****" + " Enjoy your cruise! **********************************|");
                    System.out.println();    
                    System.out.println();
                    System.out.println("| To amend another boat '" + s + "' please choose a boat number to amend from 0 to 3. ");
                    System.out.println("| Please, do not amend a boat that has not been booked '" + s + "'. ");
                    System.out.println("| Or press any other key '" + s + "' to exit this menu, thanks.");
                    if (input.hasNextInt())
                    {
                      boatAmend = input.nextInt(); 
                    }                   
                 }                    
              }
           }
        }
      }
      while (!menuBoatChoice.equals ("4"));
      
      for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
      //Declare a character variable
      char cancel;
      System.out.println();
      System.out.println("|***************************************************************|");
      System.out.println("|                                                               |");
      System.out.println("|     Please enter a character now for ticket confirmation!     |");
      System.out.println("|                                                               |");
      System.out.println("|     To book press = B                                         |");
      System.out.println("|     Or                                                        |");
      System.out.println("|     To cancel press = C or (Any other button)                 |");
      System.out.println("|                                                               |");
      System.out.println("|***************************************************************|");
      System.out.println();
      //Sets the variable cancel to the first character entered.
      cancel = input.next().charAt(0);
      // The switch construct is below
      switch (cancel)
      {
            case 'B':// B = Book.
            case 'b':
            
            for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines..
            System.out.println("* Thank you for booking with CCN Boat Hire '" + s + "', and we hope you enjoy your cruise! *");
            System.out.println();
            System.out.println("The average temperature for your cruise today '" + s + "' is according to our 10 company");
            System.out.print(" locations listed below:");
            System.out.println ();
            float [][] temperature = new float [10][365]; //Temperature array.
            //Generate temperatures:
            for (int i = 0; i < temperature.length; i++)
                for (int j = 0; j < temperature[i].length; j++)
                    temperature[i][j] = (float) (45.0*Math.random() - 10.0);
            //Calculate the average per location.
            for(int i = 0; i < temperature.length; i++)
            {
                 float average = 0.0f;  //place to store the average.
                 for(int j = 0; j < temperature[0].length; j++)
                     average += temperature[i][j];
                 //Output the average temperature for the current location
                 System.out.println("'" + s + "' the average temperature for location "+ (i+1) + " = ");
                 System.out.print(+ average/(float)temperature[i].length);
            }
            System.out.println ();
            System.out.println("|************************************************************************************************|");
            System.out.println("|                                                                        |  O  |                 |");
            System.out.println("|                               /---------------------|                  --| |--    Have         |");
            System.out.println("|                             /     *******           |                    |-|      Fun!         |");
            System.out.println("|  *------------------------/    ***Booked!***        |                    _^_                   |");
            System.out.println("|    * *WWW.CCN BOAT HIRE.COM*                        --------------------------------------|    |");
            System.out.println("|      *----------------------                                                              |    |");
              System.out.print("|        *  Thank you for booking with CCN Boat Hire '" + s + "'," );
            for (ticketFormat = 0; ticketFormat <=( 33- "s".length()); ticketFormat++)
            {
               System.out.print(" ");
            }  //Stuff inside the for loop brackets{} aranges the end lines (|||||) in the right places for a nice picture.               
            System.out.println("|    |"); //End of loop.);
            System.out.println("|          *                                                                                |    |");
            System.out.println("|            *  and we hope you enjoy your cruise!                                          |    |");
            System.out.println("|              *____________________________________________________________________________|    |");
            System.out.println("|                                                                                                |");
            System.out.println("|************************************************************************************************|");
            System.out.println();
            System.out.println("|--------------------------- None bookers only: -------------------------------------------------|");
            System.out.println("|  If you chose not to book with us today then don't worry as we'll delete your records,         |");
            System.out.println("|  and have a nice day!                                                                          |");
            System.out.println("|------------------------------------------------------------------------------------------------|");
            //Cancels the booking by exiting the programme with a cancelation message.
            break;
            case 'C':
            case 'c':
            for (clear = 0; clear <=36; clear++) {System.out.println (" ");}  //Makes a clear screen with 36 blank lines.
            System.out.println(); 
            System.out.println("|******************************|");
            System.out.println("|     -------------------      |");
            System.out.println("|-----*Booking Cancelled!*-----|");
            System.out.println("|     -------------------      |");
            System.out.println("|    Please try again today,   |");
            System.out.println("|           goodbye.           |");
            System.out.println("|******************************|");
            System.out.println();
            //Break means: another option.
            break;
            //If the user types in anything else:
            default:
            for (clear = 0; clear <=36; clear++) {System.out.println (" ");} //Makes a clear screen with 36 blank lines..
            System.out.println(); 
            System.out.println("|******************************|");
            System.out.println("|     -------------------      |");
            System.out.println("|-----*Booking Cancelled!*-----|");
            System.out.println("|     -------------------      |");
            System.out.println("|    Please try again today,   |");
            System.out.println("|           goodbye.           |");
            System.out.println("|******************************|");
            System.out.println();
      }
    }
  }
}
