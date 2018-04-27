import java.io.*;
public class MethodExampleTester{
  public static void main(String [] args) throws IOException{
 MethodExercises t = new MethodExercises();
    t.print("This is a test");
    t.printNtimes("CS", 5);
    int sum          = t.sum(3, 7);
    int largest      = t.findTheLargest(5, 7);
    int smallest     = t.findTheSmallest(5, 7);
    String larString = t.largestString("hello", "goodbye");
    int totalTimes   = t.countTotalTimes("bananas", 'a');
    int totalASCII   = t.countASCIIValues("hello world");
    int random       = t.generateRandomBetween(10,100);
    int range        = t.findSumRange(1,5);
    String out = sum+"\n"+largest+"\n"+smallest+"\n"+larString+"\n"+totalTimes+"\n"+totalASCII+"\n"+random+"\n"+range;
    t.readFile("MethodExampleTester.java");
    t.writeToFile("output.txt", out);

  }




}