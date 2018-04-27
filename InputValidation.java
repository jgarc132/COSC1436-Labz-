import java.util.Scanner;
import javax.swing.JOptionPane;

import java.lang.*;

public class InputValidation
{
  public static void main(String[] agrs)
  {
    int count = 0;
    int day = 0;

    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Please enter your first name.");
    String name = userInput.nextLine();
    
    for (int x = 0; x < name.length(); x++) {
      char y = name.charAt(x);
      // See if the character is a letter or not.
      while(!(Character.isLetter(y))){
        while (Character.isDigit(y) || !(Character.isAlphabetic(y))) {
        count++;
        System.out.println("Your name has a digit or a special character please try again");
        name = userInput.nextLine();
        if(count == 5)
        {
         System.out.println("Hi, you entered five mistakes. Please contact your official ID and try again later.");
          System.exit(0);
      }
        }
    }
  }
    System.out.println("Please enter the Month of your birth(Number 1-12)");
    int month = userInput.nextInt();
    while(month < 1 || month > 12 )
    {
      count++;
      System.out.println("This is not a real month please enter a new month");
      month = userInput.nextInt();
      if(count == 5)
      {
        System.out.println("Hi "+name+" , you entered five mistakes. Please contact your official ID and try again later.");
        System.exit(0);
        
      }
    }
    //Months
    switch(month){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("Please enter your Day of birth.(1-31)");
        day = userInput.nextInt();
        while(day < 1 || day > 31)
        {
          count++;
          System.out.println("Please enter a valid day.(1-31)");
          day = userInput.nextInt();
          
          if(count == 5)
          {
            System.out.println("Hi "+name+" , you entered five mistakes. Please contact your official ID and try again later.");
            System.exit(0);
            
          }
        }
        break;
        //CHANGE FOR LEAP YEAR
      case 2:
        System.out.println("Please enter the day of your birth.(1-28)");
        day = userInput.nextInt();
        while(day < 1 || day > 31)
        {
          count++;
          System.out.println("Please enter a valid day.(1-28)");
          day = userInput.nextInt();
          
          if(count == 5)
          {
            System.out.println("Hi "+name+" , you entered five mistakes. Please contact your official ID and try again later.");
            System.exit(0);
            
          }
        }
        break;
      default:
        System.out.println("Please enter your day of birth.(1-30)");
        day = userInput.nextInt();
        while(day < 1 || day > 31)
        {
          count++;
          System.out.println("Please enter a valid day.(1-30)");
          day = userInput.nextInt();
          
          if(count == 5)
          {
            System.out.println("Hi "+name+" , you entered five mistakes. Please contact your official ID and try again later.");
            System.exit(0);
            
          }
        }
        break;
    }
    System.out.println("Please enter the year of your birth.");
    int year = userInput.nextInt();
    System.out.println("Thank you "+name+" for entering the correct data.");
  }
}