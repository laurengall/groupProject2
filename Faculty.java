import java.util.ArrayList;

public class Faculty extends Employee {

  public final static String[] departments = {
      "Math", "Science", "English", "World Language", "Religion", "Fine Arts"
  };
  private boolean departmentHead = false;
  static ArrayList<Faculty> MathTeachers = new ArrayList<Faculty>();
  static ArrayList<Faculty> SciTeachers = new ArrayList<Faculty>();
  static ArrayList<Faculty> EngTeachers = new ArrayList<Faculty>();
  static ArrayList<Faculty> WorldLangTeachers = new ArrayList<Faculty>();
  static ArrayList<Faculty> RelTeachers = new ArrayList<Faculty>();
  static ArrayList<Faculty> FATeachers = new ArrayList<Faculty>();

  static ArrayList<ArrayList<Faculty>> DepartmentTeachers = new ArrayList<ArrayList<Faculty>>();

  // constuctors
  public Faculty() {

  }

  public Faculty(int id, String name, int yearsExp, String department, String degree, boolean depHead) {
    super(id, name, yearsExp, "faculty", degree, depHead);
    addDepartment(department);
  }

  // methods

  // nah
  public void addDepartment(String depName) {
    switch (depName.toLowerCase()) {
      case "math":
        MathTeachers.add(this);
        break;
      case "science":
        SciTeachers.add(this);
        break;
      case "english":
        EngTeachers.add(this);
        break;
      case "world language":
        WorldLangTeachers.add(this);
        break;
      case "religion":
        RelTeachers.add(this);
        break;
      case "fine arts":
        FATeachers.add(this);
      default:
        break;
    }
  }

  public int removeFromDep(String depName, int empId){
    switch(depName){
      case "math":
        for(int i = 0; i < MathTeachers.size(); i++){
          if(MathTeachers.get(i).getId() == empId){
            MathTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "science":
        for(int i = 0; i < SciTeachers.size(); i++){
          if(SciTeachers.get(i).getId() == empId){
            SciTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "english":
        for(int i = 0; i < EngTeachers.size(); i++){
          if(EngTeachers.get(i).getId() == empId){
            EngTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "world language":
        for(int i = 0; i < WorldLangTeachers.size(); i++){
          if(WorldLangTeachers.get(i).getId() == empId){
            WorldLangTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "religion":
        for(int i = 0; i < RelTeachers.size(); i++){
          if(RelTeachers.get(i).getId() == empId){
            RelTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "fine arts":
        for(int i = 0; i < FATeachers.size(); i++){
          if(FATeachers.get(i).getId() == empId){
            FATeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      default:
        System.out.println(depName+" is not a valid department name");
        return -1;
    }
    return -1;
  }

  static public void printAllDep() {
      System.out.print("Math Teachers: ");
      for (int i = 0; i < MathTeachers.size(); i++) {
        System.out.print(MathTeachers.get(i).getName() + ", ");
      }
      System.out.print("\nScience Teachers: ");
      for (int i = 0; i < SciTeachers.size(); i++) {
        System.out.print(SciTeachers.get(i).getName() + ", "); 
      }
    System.out.print("\nEnglish Teachers: ");
      for (int i = 0; i < EngTeachers.size(); i++) {
        System.out.print(EngTeachers.get(i).getName() + ", ");
      }
    System.out.print("\nWorld Language Teachers: ");
      for (int i = 0; i < WorldLangTeachers.size(); i++) {
        System.out.print(WorldLangTeachers.get(i).getName() + ", ");
      }
    System.out.print("\nReligion Teachers: ");
      for (int i = 0; i < RelTeachers.size(); i++) {
        System.out.print(RelTeachers.get(i).getName() + ", ");
      }
    System.out.print("\nFine Art Teachers: ");
      for (int i = 0; i < FATeachers.size(); i++) {
        System.out.print(FATeachers.get(i).getName() + ", ");
      }
    System.out.println();
    }

}
