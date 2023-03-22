/*import java.util.ArrayList;

public class Subject {

  private int numOfStudents;
  private double gpa;
  private boolean isAP;
  private boolean isHonors;
  private boolean isRegular;
  private String nameTeacher;

ArrayList<Student> students = new ArrayList<Student>();

public Subject(int numOfStudents, boolean isAP, boolean isHonors, boolean isRegular, String nameTeacher, ArrayList<Student> students){

  this.numOfStudents = numOfStudents;
  this.isAP = isAP;
  this.isHonors = isHonors;
  this.isRegular = isRegular;
  this.nameTeacher = nameTeacher;
  this.students = students;
}

  public Subject(){
  
}


public double averageClassGPA(ArrayList<Student> s){
 int sum = 0;

  for(int i = 0; i < s.size(); i++){
    sum += s.get(i).getGPA();
  }
   return sum/s.size(); 
  }


  public void printClassRoster(){
   for(Student s: students){
    System.out.println(s);
  }
}   
  





  
public int getNumOfStudents() {
	return numOfStudents;
}

public void setNumOfStudents(int numOfStudents) {
	this.numOfStudents = numOfStudents;
}

public double getGpa() {
	return gpa;
}

public void setGpa(double gpa) {
	this.gpa = gpa;
}

public boolean isAP() {
	return isAP;
}

public void setAP(boolean isAP) {
	this.isAP = isAP;
}

public boolean isHonors() {
	return isHonors;
}

public void setHonors(boolean isHonors) {
	this.isHonors = isHonors;
}
public boolean isRegular() {
	return isRegular;
}

public void setRegular(boolean isRegular) {
	this.isRegular = isRegular;
}

public String getNameTeacher() {
	return nameTeacher;
}

public void setNameTeacher(String nameTeacher) {
	this.nameTeacher = nameTeacher;
}

public ArrayList<Student> getStudents() {
	return students;
}

public void setStudents(ArrayList<Student> students) {
	this.students = students;
}
  
}
*/