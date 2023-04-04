public class Student {
	private String name;
	private String gender;
	private double GPA;
	private int age;
	private boolean isReligious;

	public Student(String name, String gender, double GPA, int age, boolean isReligious) {
		this.name = name;
		this.gender = gender;
		this.GPA = GPA;
		this.age = age;
		this.isReligious = isReligious;
	}

	public boolean isReligious() {
		return isReligious;
	}

	public void setReligious(boolean religious) {
		isReligious = religious;
	}

	public double getGPA() {
		return GPA;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setGPA(double GPA) {
		this.GPA = GPA;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public String toString() {
		return "Student{" +
			"gender='" + gender + '\'' +
			", GPA=" + GPA +
			", age=" + age +
			", isReligious=" + isReligious +
			'}';
	}
}
