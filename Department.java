import java.util.ArrayList;

public class Department {
	private String subject;
	private Faculty head = new Faculty();
	private int numOfFaculty;
  private ArrayList<Subject> subjectList = new ArrayList<Subject>();
  private ArrayList<Faculty> facultyList = new ArrayList<Faculty>();

  public Department(){
    
  }
  
	public ArrayList<Subject> getSubjectList() {
	return subjectList;
}

public void setSubjectList(ArrayList<Subject> subjectList) {
	this.subjectList = subjectList;
}

	public Department(String s, Faculty head, int n, ArrayList<Subject> subjects, ArrayList<Faculty> faculty){
		this.subject = s;
		this.head = head;
		this.numOfFaculty = n;
    this.subjectList = subjects;
    facultyList = faculty;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Faculty getHead() {
		return head;
	}

	public void setHead(Faculty head) {
		this.head = head;
	}

	public int getNumOfFaculty() {
		return numOfFaculty;
	}

	public void setNumOfFaculty(int numOfFaculty) {
		this.numOfFaculty = numOfFaculty;
	}

	public ArrayList<Subject> getSubjects() {
		return subjectList;
	}

	public void setSubjects(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
  public void facultyToStudent() {
   // System.out.println("The faculty to student ratio is " + super.getnumOfFaculty()/super + ".");
  }
}