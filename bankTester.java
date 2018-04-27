public class bankTester{
  public static void main(String[] args){
  Bank b1 = new Bank(32145,9090);
  System.out.println(b1.getPassword());
  b1.changePassword();
  System.out.println(b1.getPassword());
   b1.depositMoney();
  }
}