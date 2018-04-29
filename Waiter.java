public class Waiter{
  private String name;
  private int numberOfTables;
  private boolean shift;
  private double wage;
  public static int COUNTER;
  public Waiter(){
    this.name = null;
    this.numberOfTables = 0;
    this.shift = false;
    this.wage = 0.0;
    COUNTER += 1;
  }
  public Waiter(String name,boolean shift){
    this.name = name;
    this.numberOfTables = 0;
    this.shift = shift;
    this.wage = 0.0;
    COUNTER +=1;
  }
  public Waiter(String name,int numberOfTables, boolean shift,double wage){
    this.name = name;
    this.numberOfTables = numberOfTables;
    this.shift = shift;
    this.wage = wage;
    COUNTER += 1;
  }
  public String getName(){
    return this.name;
  }
  public int getNumberOfTables(){
    return this.numberOfTables;
  }
  public boolean getShift(){
    return this.shift;
  }
  public double getWage(){
    return this.wage;
  }
  public String getCOUNTER(){
    return "The total Waiters made were " + COUNTER; 
  }
  public void setName(String name){
    this.name = name;
  }
  public void setNumberOfTables(int numberOfTables){
    this.numberOfTables = numberOfTables;
  }
  public void setShift(boolean shift){
    this.shift = shift;
  }
  public void setWage(double wage){
    this.wage = wage;
  }
  public String getShiftFormat(boolean shift){
    if(shift == true)
      return "A.M.";
    else
      return "P.M.";
  }
  public double getTotalEarnedToday(int numberOfTables , double wage){
    return numberOfTables * wage;
  }
  public String toString(){
    return "Name: " + name + " serving the " + getShiftFormat(shift) + " shift. Currently served " 
      + numberOfTables + " tables. \n"+"Today's total payment $" 
      + getTotalEarnedToday(numberOfTables,wage); 
  
  }
}