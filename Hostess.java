public class Hostess extends Waiter{
  private int bussedTables;
  public Hostess(int bussedTables){
    this.bussedTables = bussedTables;
  }
  public String toString(){
    return "Name: " + getName() + " hosting the " + getShiftFormat(getShift()) + " shift. Currently cleaned a total of " 
      + getNumberOfTables() + " tables. \n"+"Today's total payment $" 
      + (getTotalEarnedToday(getNumberOfTables(),getWage()) + (getNumberOfTables() * 2.50)); 
  }
}