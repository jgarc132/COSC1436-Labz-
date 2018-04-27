/*
 * Programmer: J. Garcia
 * Date:04/20/2018
 * */
import java.util.Scanner;
import java.io.*;
public class StudentTester{
  public static int students = 0;
  public static void main(String[] args)throws IOException{
    Scanner uI = new Scanner(System.in),uIS = new Scanner(System.in),uID = new Scanner(System.in);
    p("How many Student will you enter?");
    while(!uI.hasNextInt()){
      p("That is not an integer pleae try again");
      uI.next();
    }
    students = uI.nextInt();
    Student[] studentArray = new Student[students];
    for(int i = 0; i < students;i++){
      studentArray[i] = new Student();
      p("Please enter the name of student ");
      studentArray[i].setName(uIS.nextLine());
      p("Please enter grade 1");
      studentArray[i].setGrade1(uID.nextDouble());
      p("Please enter grade 2");
      studentArray[i].setGrade2(uID.nextDouble());
      p("Please enter grade 3");
      studentArray[i].setGrade3(uID.nextDouble());
    }
    printToFile("studentTester.txt",studentArray);
  }
  public static void printToFile(String f,Student[] a)throws IOException{
    File file = new File(f);
    PrintWriter pr = new PrintWriter(file);
    pr.println(a[0].outputString());
    pr.println("-------------------------------------------------------------------");
    for(Student itor : a){
      pr.println(itor.outputString2());
    }
    pr.println(classAverage(a));
    pr.close();
  }
  public static double classAverage(Student[] a){
    double cAVG = 0;
    for(Student itor : a)
      cAVG = cAVG + itor.gradeAVG();
    
    cAVG = (cAVG / students);
    return cAVG;
  }
  public static void p(String pr){
    System.out.println(pr);
  }
}