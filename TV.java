/**
 * @author J.Garcia
 * @since April 20,2018
 * */
public class TV{
  private int volume;
  private int channel;
  private boolean power;
  private boolean mute;
  /**
   * TV default constructor
   * */
  public TV(){
    this.volume = 0;
    this.channel = 0;
    this.power = false;
    this.mute = false;
  }
  /**
   * Constructor with all 4 parameters
   * @param volume Volume of Tv
   * @param channel Channel of Tv
   * @param power State of Tv
   * @param mute Volume On or Off on TV
   * */
  public TV(int volume,int channel,boolean power, boolean mute){
    this.volume = volume;
    this.channel = channel;
    this.power = power;
    this.mute = mute;
  }
  /**
   * Constructor with power
   * @param power State of Tv
   * */
  public TV(boolean power){
    this.volume = 0;
    this.channel = 0;
    this.power = power;
    this.mute = false;
  }
  /**
   * Getter for Volume
   * @return int Volume
   * */
  public int getVolume(){
    return volume;
  }
  
  /**
   * Getter for Channel
   * @return int Channel
   * */
  public int getChannel(){
    return channel;
  }
  
  /**
   * Getter for Power
   * @return boolean Power
   * */
  public boolean getPower(){
    return power;
  }
  
  /**
   * Getter for Mute
   * @return boolean Mute
   * */
  public boolean getMute(){
    return mute;
  }
  /**
   * Setter for Volume
   * @param volume Volume
   * */
  public void setVolume(int volume){
    this.volume = volume;
  }
    /**
   * Setter for Channel
   * @param channel Channel
   * */
  public void setChannel(int channel){
    this.channel = channel;
  }
    /**
   * Setter for Power
   * @param power Power
   * */
  public void setPower(boolean power){
    this.power = power;
  }
    /**
   * Setter for Mute
   * @param mute Mute
   * */
  public void setMute(boolean mute){
    this.mute = mute;
  }
  /*
   * Changes Volume Up
   * */
  public void volumeUp(){
    volume += 10;
    System.out.println("Volume raised to " + volume);
  }
  /*
   * Changes Volume Down
   * */
  public void volumeDown(){
    volume -= 10;
    System.out.println("Volume lowerd to " + volume);
  }
  /**
   * Turn On or Off Tv
   * */
  public void tvSwitch(){
    if(power == false){
      System.out.println("TV powerd on");
      power = true;
    }else{
      System.out.println("TV powerd off");
      power = false;
    }  
    
  }
}