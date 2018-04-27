import java.util.Scanner;
/*
 * @author J.Garcia
 * @since April 20,2018
 * */
public class Bank{
  private boolean deposit;
  private int customerID;
  private int password;
  private double accountMoney;
  /**
   * Constructor of default Bank
   * */
  public Bank(){
    this.deposit = false;
    this.customerID = 0;
    this.password = 0;
    this.accountMoney = 0;
  }
  /**
   * Main Contructor for Bank
   * */
  public Bank(boolean deposit, int customerID, int password, double accountMoney){
    this.deposit = deposit;
    this.customerID = customerID;
    this.password = password;
    this.accountMoney = accountMoney;
  }
  /**
   * Constructor with Customer ID, and Password
   * */
  public Bank(int customerID,int password){
    this.deposit = false;
    this.customerID = customerID;
    this.password = password;
    this.accountMoney = 0;
  }
  /**
   * Getter for Deposite
   * @return boolean Depsit
   * */
  public boolean getDeposit(){
    return deposit;
  }
  /**
   * Getter for Customer ID
   * @return int CustomerID
   * */
  public int getCustomerID(){
    return customerID;
  }
  /**
   * Getter for Password
   * @return int Password
   * */
  public int getPassword(){
    return password;
  }
  /**
   * Getter for Account Money
   * @return double Account Money
   * */
  public double getAccountMoney(){
    return accountMoney;
  }
  /**
   * Setter for deposit
   * @param deposit Deposite
   * */
  public void setDeposit(boolean deposit){
    this.deposit = deposit;
  }
  /**
   * Setter for Customer ID
   * @param customerID Customer ID
   * */
  public void setCustomerID(int customerID){
    this.customerID = customerID;
  }
  /**
   * Setter for password
   * @param password Password
   * */
  public void setPassword(int password){
    this.password = password;
  }
  /**
   * Setter for Account Money
   * @param accountMoney Accont Money
   * */
  public void setAccountMoney(double accountMoney){
    this.accountMoney = accountMoney;
  }  
  /**
   * Deposit Money to Account
   * */
  public void depositMoney(){
    Scanner uI = new Scanner(System.in);
    System.out.println("How much would you like to deposite?");
    double money = uI.nextDouble();
    System.out.println("Money being transfered");
    accountMoney = money + accountMoney;
    System.out.println("Your new Account Balance is $" + accountMoney);
  }
  /**
    * Change Account Password 
    * */
  public void changePassword(){
    Scanner uI = new Scanner(System.in);
    System.out.println("Please put in your Customer ID");
    int customerID = uI.nextInt();
    if(this.customerID == customerID){
      System.out.println("Please enter your password");
      int password = uI.nextInt();
      if(this.password == password){
        System.out.println("Please enter your new Password");
        int newPass = uI.nextInt();
        setPassword(newPass);
        System.out.println("Password has been changed");
      }else{
        System.out.println("That is not the right password please try again later.");
      }
    }else{
      System.out.println("That is not a valid ID.");
    }
  }
}