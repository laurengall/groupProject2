import java.util.ArrayList;

public class Subject {

  public String name;
  private double gpa;
  private boolean isAP;
  private boolean isHonors;
  private boolean isRegular;
  private Faculty teacher;

  static ArrayList<Subject> classes = new ArrayList<Subject>();
  ArrayList<Student> students = new ArrayList<Student>();

public Subject(String name, boolean isAP, boolean isHonors, boolean isRegular){
  this.name = name;
  this.isAP = isAP;
  this.isHonors = isHonors;
  this.isRegular = isRegular;
  classes.add(this);
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
	return students.size();
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

public Faculty getTeacher() {
	return teacher;
}

public void setTeacher(Faculty teacher) {
	this.teacher = teacher;
}

public static void addToClass(Subject su, Student s) {
	su.students.add(s);
}

public void addToClass(Student s){
  students.add(s);
}
  
}