public class Phone{
  private String brand;
  private String owner;
  private int number;
  private int battery;
  public Phone(){
    this.brand = null;
    this.owner = null;
    this.number = 0;
    this.battery = 0;
  }
  public Phone(String brand,String owner,int number,int battery){
    this.brand = brand;
    this.owner = owner;
    this.number = number;
    this.battery = battery;
  }
  public String getBrand(){
    return brand;
  }
  public String getOwner(){
    return owner;
  }
  public int getNumber(){
    return number;
  }
  public int getBattery(){
    return battery;
  }
  public void setBrand(String brand){
    this.brand = brand;
  }
  public void setOwner(String owner){
    this.owner = owner;
  }
  public void setNumber(int number){
    this.number = number;
  }
  public void setBattery(int battery){
    this.battery = battery;
  }
  public void determineBatteryLife(){
    if(brand.equals("IOS") && battery < 80){
      System.out.println("Your phones at " + battery + " and will take around 20 min");
    }else if(battery < 50){
      System.out.println("Your phones at " + battery + "and will take around 45 min");
    }else if(battery < 25){
      System.out.println("Your phones at " + battery + "and will take around 55 min");
    }else if(battery < 0){
      System.out.println("Your phones at " + battery + "and will take 1hr and around 5 min");
    }else if(battery == 0){
      System.out.println("Your phones dead and will take one hour and a half to fully charge");
    }
    if(brand.equals("Android") || brand.equals("android") && battery < 80){
      System.out.println("Your phones at " + battery + " and will take around 30 min");
    }else if(battery < 50){
      System.out.println("Your phones at " + battery + "and will take around 55 min");
    }else if(battery < 25){
      System.out.println("Your phones at " + battery + "and will take around 1hr & 5 min");
    }else if(battery < 0){
      System.out.println("Your phones at " + battery + "and will take 1hr & 15 min");
    }else if(battery == 0){
      System.out.println("Your phones dead and will take one hour and a half to fully charge");
    }
  }
}