import java.util.ArrayList;
public class Faculty extends Employee{

  public final static String[] departments = {
    "Math", "Science", "English", "World Language", "Religion", "Fine Arts"
  };

  static ArrayList<String> MathTeachers = new ArrayList<String>();
  static ArrayList<String> SciTeachers = new ArrayList<String>();
  static ArrayList<String> EngTeachers = new ArrayList<String>();
  static ArrayList<String> WorldLangTeachers = new ArrayList<String>();
  static ArrayList<String> RelTeachers = new ArrayList<String>();
  static ArrayList<String> FATeachers = new ArrayList<String>();
  
  static ArrayList<ArrayList<String>> DepartmentTeachers =  new ArrayList<ArrayList<String>>();

  

  public Faculty(int id, String name, int salary, int yearsExp){
    super(id, name, salary, yearsExp);
  }
  public Faculty(int id, String name, int salary, int yearsExp, String department){
    super(id, name, salary, yearsExp); 
    addDepartment(department);
  }
  
    public void addDepartment(String depName) {
      switch (depName.toLowerCase()) {
        case "math":
          MathTeachers.add(super.getName());
          break;
        case "science":
          SciTeachers.add(super.getName());
          break;
        case "english":
          EngTeachers.add(super.getName());
          break;
        case "world language":
          WorldLangTeachers.add(super.getName());
          break;
        case "religion":
          RelTeachers.add(super.getName());
          break;
        case "fine arts":
          FATeachers.add(super.getName());
        default:
          break;
      }



  


  
}
}