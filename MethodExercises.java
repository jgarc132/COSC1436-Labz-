/*
 * Programmer: J. Garcia
 * Pragremmer: M. Corral
 * Date: 03/23/2018
 * Purpose: Better understanding of methods
 * 
 * */
import java.util.Random;
import java.util.Scanner;
import java.io.*;
public class MethodExercises{
  /**
   * Prints out line of code
   * @param a The string wanting to print.
   * */
  public static void print(String a){
    p(a);
  }
  /**
   * Prints line a number of times
   * @param b String wanting to print out.
   * @param c The number of times to print out String.
   * */
  public static void printNtimes(String b,int c){
    for(int x = 0;x < c; x++){
      p(b);
    }  
  }//End of printNtimes
  
  /**
   * Does the sum of two givin integers
   * @param d First int.
   * @param e Second int.
   * @return f Sum of the two ints
   * */
  public static int sum(int d,int e){
    int f = d+e;
    p("The sum of " + d + " and " + e + " is " + f);
    return f;
  }
  /**
   * Gives the largest int
   * @param x First int.
   * @param y Second int.
   * @return l largest number
   * */
  public static int findTheLargest(int x,int y){
    int l = 0;
    if(x != y){
      if(x > y){
        p("The largest number is: " + x);
        l = x;
      }else if(x < y){
        p("The largest nummber is: " + y);
        l = y;
      }
    }
    return l;
  }//End of findTheLargest
  
  /**
   * Gives the smallest int
   * @param x First int.
   * @param y Second int.
   * @return s smallest number
   * */
  public static int findTheSmallest(int x,int y){
    int s = 0;
    if(x != y){
      if(x > y){
        p("The Smallest number is: " + y);
        s = y;
      }else if(x < y){
        p("The Smallest nummber is: " + x);
        s = x;
      }
    }
    return s;
  }//End of findTheSmallest
  
  /**
   * Finds the largest String
   * @param x First String.
   * @param y Second String.
   * @return l largest String
   * */
  public static String largestString(String x,String y){
    String l = "";
    int Xl = x.length();
    int Yl = y.length();
    if(Xl > Yl){
      p("The largest string is  "+ x);
      l = x;
    }
    else{
      p("The largest string is  "+ y);
    l = y;}
    return l;
  }//End of largestString
  
  /**
   * Counts the total times a char is found in a string
   * @param x First String.
   * @param y Second char.
   * @return c total number of times char is in String
   * */
  public static int countTotalTimes(String x, char y){
    int c = 0;
    for(int i = 0;i < x.length();i++){
      char z = x.charAt(i);
      if(z == y){
        c++;
      }
    }
    p("The number of " + y + " in " + x + " is " + c );
    return c;
  }//End of countTotalTimes
  
  /**
   *Section adds up all the ASCII values 
   * @param x First String.
   * @return z total of all ASCII Values
   * */
  public static int countASCIIValues(String x){
    char y;
    int z = 0;
    for(int i = 0;i < x.length();i++){
      y = x.charAt(i);
      z = z + y;
    }
    p("The Total ASCII of "+x+" is "+z); 
    return z;
  }//End of countASCIIValues
  
  /**
   * Generates a random number between two ints
   * @param x Smallest int to get a random number between.
   * @param y Largest int to get a random number between.
   * @return n1 random  number generated
   * */
  public static int generateRandomBetween(int x,int y){
    Random randomNumbers = new Random();
    int n1 = randomNumbers.nextInt(y)+x;
    while(n1 > 100 || n1 < 50){
      n1 = randomNumbers.nextInt(y)+x;
    }
    p("The random number from "+ x +" and " + y + " is " + n1);
    return n1;
  }//End of generateRandomBetween
  
  /**
   * Adds the firsg number to every number after it until it gets to the scond int.
   * @param x First int.
   * @param y Second int.
   * @return sum total Sum Range 
   * */
  public static int findSumRange(int x,int y){
    int sum = 0;
    for(int z = x; z < y;z++){
      sum = sum+z;
    }
    sum = sum+y;
    p("The Sum Range of " + x + " and " + y + " is " + sum);
    return sum;
  }//End of findSumRange
  
  /**
   * This section reads into the file and checks for next line
   * @param f String This is the name of the file choosen to be viewed.
   * @throws IOException
   * */
  public static void readFile(String f) throws IOException{
    File file = new File(f);
    Scanner fsc = new Scanner(file);
    int i = 0;
    while(fsc.hasNext()){
      String line = fsc.nextLine();
      i++;
      p("This is line " + i + " in the file : " +  line);
    }
    fsc.close();
  }//End of readFile
  
  /**
   * Part writes into file
   * @param s First String which tells the method which file to append from.
   * @param f Second String which tells the methos which file to write from the previouse file.
   * @throws IOException ioexception
   * */
  public static void writeToFile(String s,String f)throws IOException{
    File file = new File(s);
    PrintWriter pr = new PrintWriter(file);
    
    if(!file.exists()){
      file.createNewFile();
      p("File " + s + " was created");
    }else{
      p("File " + s + " exists");
    }
    pr.print(f);
    p("This was printed on file " + s + " \n" + f);
    pr.close();
  }//End of writeFile
  
  /**
   * System.out.println Method
   * @param P String to be printed out.
   * */
  public static void p(String P){
    System.out.println(P);
  }
}//End of class
