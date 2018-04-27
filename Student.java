public class Student{
  private String name;
  private double grade1;
  private double grade2;
  private double grade3;
  
  public Student(){
    this.name = null;
    this.grade1 = 0;
    this.grade2 = 0;
    this.grade3 = 0;
  }
  public Student(String name, double grade,double grade2,double grade3){
    this.name = name;
    this.grade1 = grade1;
    this.grade2 = grade2;
    this.grade3 = grade3;
  }
  public void setName(String name){
    this.name = name;
  }
  public void setGrade1(double grade1){
    this.grade1 = grade1;
  }
  public void setGrade2(double grade2){
    this.grade2 = grade2;
  }
  public void setGrade3(double grade3){
    this.grade3 = grade3;
  }
  public String getName(){
    return this.name;
  }
  public double getGrade1(){
    return this.grade1;
  }
  public double getGrade2(){
    return this.grade2;
  }
  public double getGrade3(){
    return this.grade2;
  }
  public double gradeAVG(){
    double avg = (grade1 + grade2 + grade3)/3;
       return avg;
  }
  public String outputString(){
    String output = "NAME          GRADE1     GRADE2     GRADE3          AVERAGE ";
      return output;
  }
   public String outputString2(){
    String output = name +"          "+ grade1 +"        "+ grade2 +"        "+ grade3 +"             " + gradeAVG();
      return output;
  }
}
