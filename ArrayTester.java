/*
 * Programmer: J.Garcia
 * Date: 04/01/2018
 * Extra Credit
 * */
public class ArrayTester{
  public static double sum = 0;
  public static double avg = 0;
  public static void main(String[] args){
    double n[] = {3,1,8,2,6,7};
    print(n);
    findSum(n);
    findAVG(n);
    printReverse(n);
    alternatePrint(n);
  }
  public static void print(double p[]){
    for(int i = 0;i < p.length;i++){
      p("The "+ i + " position of the array has " + p[i]);
    }
  }
  public static double findSum(double p[]){
    for(int i = 0; i < p.length;i++){
      sum = sum + p[i];
    }
    p("The addition of all the numbers in the arrat is " + sum);
    return sum;
  }
  public static double findAVG(double p[]){
    avg = p.length / sum;
    System.out.printf("The average of the array is %.2f \n",avg);
    return avg;
  }
  public static void printReverse(double p[]){
    for(int i = p.length -1; i >= 0;i--){
      p("Revers: "+ p[i]);
    }
  }
  public static void alternatePrint(double p[]){
    for(int i = 0;i < p.length - 3;i++){
      p("Alternative: " + p[i]);
      p("Alternative: " + p[p.length -(i + 1)]);
    }
  } 
  public static void p(String s){
    System.out.println(s);
  }
}
