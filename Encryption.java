/*
 * Programmer: J.Garcia
 * Programmer: M.Corral
 * Date: 04/01/2018
 * Lab 08
 * */
import java.util.Scanner;
import java.io.*;
public class Encryption{
  
  public static String c = "";
  public static int u = 0;
  
  public static void main(String args[]) throws IOException
  {
    Scanner uI = new Scanner(System.in);
    p("Please enter file");
    String f = uI.nextLine();
    readFile(f);
    writeFile(c,removeLast4Chars(f));
  }//end of main
  public static String removeLast4Chars(String f02){
    String fL = f02.substring(0,f02.length() - 4) + "Output.txt";
    return fL;
  }
  public static String readFile(String f)throws IOException{
    File file = new File(f);
    if(!file.exists()){
    p("No such file excists please try again with a pre-made file thank you Good-bye!");
    System.exit(5);
    }
    Scanner snF = new Scanner(file);
    while(snF.hasNext()){
      c = c + " " + snF.nextLine();
    }
    snF.close();
    return c;
  }//end of readFile
  public static int getUnicode(char c){
    u = (int)c;
    return u;
  }//end of getUnicode
  public static void writeFile(String s, String f)throws IOException{
    File file02 = new File(f);
    if(!file02.exists()){
      file02.createNewFile();
      p("New file named " + f + " was created ");
    }else{
      p("File "+ file02 +" already excists");
    }
    PrintWriter pr = new PrintWriter(file02);
    for(int i = 0;i < s.length();i++){
      char c = s.charAt(i);
      getUnicode(c);
      pr.print(u + " ");
    }
    pr.close();
  }//end of writeFile
  public static void p(String p){
    System.out.println(p);
  }//end of p
}