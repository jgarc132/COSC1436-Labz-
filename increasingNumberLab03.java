import java.util.Scanner;
public class increasingNumberLab03
{
  public static void main (String[] args)
  {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter the first number");
    int x = userInput.nextInt();
    System.out.println("Enter the second number");
    int y = userInput.nextInt();
    if (x > y || x!= y)
    {
      System.out.println(""+x+"  "+y+"");
    }
    else
    {
      System.out.println(""+y+"  "+x+"");
    }
  }
}