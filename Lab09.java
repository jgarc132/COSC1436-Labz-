/*
 *Programmers: J. Garcia, M. Corral
 * Pourose: Lab 09
 * Date: 04/04/2018
 */
import java.util.*;
import java.io.*;
import java.lang.Math;

public class Lab09{
  
  public static double avg = 0.0;
  public static void main (String [] Args)throws IOException{
    Scanner w = new Scanner(System.in);
    String f = "numbers.txt";
    File file = new File(f);
    Scanner uI = new Scanner(file), uI02 = new Scanner(file);
    int i = 0;
    while(uI.hasNext()){
      uI.nextLine();
      i++;
    }
    int[] numbers = new int[i];
    while(uI02.hasNext()){
      for(int x = 0; x < numbers.length;x++){
        numbers[x] = uI02.nextInt();
      }
    }
    uI.close();
    avg = getAVG(numbers);
    System.out.println("Please put the file name you would like to print out the "
                         +"the outcomes of the array");
    String s = w.nextLine();
    writeToFile(s,numbers);
  }//end of main
  
  public static int getSum(int[] a){
    int SUM = 0;
    for(int i = 0; i < a.length;i++){
      SUM = a[i] + SUM;
    }
    return SUM;
  }//end of getSum
  
  public static double getAVG(int[] a){
    double ag = getSum(a) / a.length;
    return ag;
  }//end of getAVG
  
  public static int getMax(int[] a){
   int l = a[0];
     for(int i = 0;i < a.length;i++){
       if(l < a[i]){
        l = a[i];
        }
     }
  return l;
  }//end of getMax
  
  public static int getMin(int[] a){
   int m = a[0];
     for(int i = 0;i < a.length;i++){
       if(m > a[i]){
        m = a[i];
        }
     }
  return m;
  }//end of getMin
  public static double getStdDev(int[] a){
    double p = 0;
    double s = 0;
    for(int  i = 0; i < a.length;i++){
      p = p +(Math.pow((a[i] - avg),2));
    }
    s = Math.sqrt(p/(a.length - 1));
    return s;
  }//end of StdDev
  
  public static void writeToFile(String s,int[] a)throws IOException{
    File file = new File(s);
    PrintWriter pr = new PrintWriter(file);
    pr.println("The Sum is: " + getSum(a) + "\n");
    pr.println("The Avg is: " + getAVG(a) + "\n");
    pr.println("The Max is: " + getMax(a) + "\n");
    pr.println("The Min is: " + getMin(a) + "\n");
    pr.println("Standard Deviation is: " + getStdDev(a) + "\n");
    pr.close();
  }
}