public class OliveGarden{
  public static void main(String[] args){
    Waiter[] waiters = new Waiter[10];
    waiters[0] = new Waiter("Juan",5,true,7.50);
    waiters[1] = new Waiter("Mike",8,false,7.50);
    waiters[2] = new Waiter("Miguel",5,true,7.50);
    waiters[3] = new Waiter("Liza",4,true,7.50);
    waiters[4] = new Waiter("Chris",3,true,7.50);
    waiters[5] = new Waiter("Marco",6,false,7.50);
    waiters[6] = new Waiter("Rogelio",2,true,7.50);
    waiters[7] = new Waiter("Emily",3,false,7.50);
    waiters[8] = new Waiter("Victoria",7,true,7.50);
    waiters[9] = new Waiter("Snoop Dog",0,false,7.50);
    Hostess host1 = new Hostess(getManyTablesServed(waiters));
    Hostess host2 = new Hostess(getManyTablesServed(waiters));
    Hostess host3 = new Hostess(getManyTablesServed(waiters));
    
    System.out.println("Total Served Tables: "+getManyTablesServed(waiters));
    System.out.println("Total Earned by $" + getTotalEarnedByShift(waiters,"P.M."));
    System.out.println("Total Hostess Earned : $"+getTotalToHostess(waiters,"P.M."));
  }
  public static int getManyTablesServed(Waiter[] waiters){
    int tablesServed = 0;
    for(int i = 0;i < waiters.length;i++){
      tablesServed += waiters[i].getNumberOfTables();
    }
    return tablesServed;
  }
  public static double getTotalEarnedByShift(Waiter[] waiters,String shift){
    double total = 0;
    for(int i = 0;i < waiters.length;i++){
    if(shift.equals(waiters[i].getShiftFormat(waiters[i].getShift()))){
      total += waiters[i].getTotalEarnedToday(waiters[i].getNumberOfTables(),waiters[i].getWage());
      }
    }
    return total;
  }
  public static double getTotalToHostess(Waiter[] w,String shift){
    double tipToHostess = 0;
    int inShift = 0;
    for(int i = 0;i < w.length;i++){
      if(shift.equals(w[i].getShiftFormat(w[i].getShift()))){
        inShift += 1;
      }
    }
    tipToHostess = ((getTotalEarnedByShift(w,shift))/inShift)*.5;
    return tipToHostess * .5;
  }
}