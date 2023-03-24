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

  public Faculty(String name, int yearsExp, String department, String degree, boolean depHead) {
    super(name, yearsExp, "faculty", degree, depHead);
    addDepartment(department);
  }

  // methods
  //edit method
  public void editEmployee(){
    boolean cont = true;
    while (cont) {
      System.out.println("--------------------------------------------------\n");
      System.out.println("Editing: " + super.getName());
      System.out.println("1 - Change Name");
      System.out.println("2 - Change Degree");
      System.out.println("3 - Change Years working");
      System.out.println("4 - Add Classes");
      System.out.println("5 - Back to main");
      int input = Tools.getInputInt();
      Tools.clear();
    
      switch (input) {
        case 1:
          System.out.println("Current Name: " + super.getName());
          System.out.println("New Name:");
          super.setName(Tools.getInput());
          break;
        case 2:
          System.out.println("Current Degree: " + super.getDegree());
          System.out.println("New Degree:");
          super.setDegree(Tools.getInput());
          super.calculateSalary(departmentHead);
          break;
        case 3:
          System.out.println("Current Experience: " + super.getYearsExp());
          System.out.println("New Experience:");
          super.setYearsExp(Tools.getInputInt());
          super.calculateSalary(departmentHead);
          break;
        case 4:
          break;
        case 5:
          cont = false;
          break;
        default:
          System.out.println("Not a valid command");
          break;
      }
    }
  }
  // add to dept
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

  // remove from dept
  public int removeFromDep(String depName, int empId) {
    switch (depName) {
      case "math":
        for (int i = 0; i < MathTeachers.size(); i++) {
          if (MathTeachers.get(i).getId() == empId) {
            MathTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "science":
        for (int i = 0; i < SciTeachers.size(); i++) {
          if (SciTeachers.get(i).getId() == empId) {
            SciTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "english":
        for (int i = 0; i < EngTeachers.size(); i++) {
          if (EngTeachers.get(i).getId() == empId) {
            EngTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "world language":
        for (int i = 0; i < WorldLangTeachers.size(); i++) {
          if (WorldLangTeachers.get(i).getId() == empId) {
            WorldLangTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "religion":
        for (int i = 0; i < RelTeachers.size(); i++) {
          if (RelTeachers.get(i).getId() == empId) {
            RelTeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      case "fine arts":
        for (int i = 0; i < FATeachers.size(); i++) {
          if (FATeachers.get(i).getId() == empId) {
            FATeachers.remove(i);
            return 0;
          }
        }
        System.out.println("Teacher is not in department: " + depName);
        break;
      default:
        System.out.println(depName + " is not a valid department name");
        return -1;
    }
    return -1;
  }

  // add subjects
  public static void addSubjects() {

  }

  // print dept
  static public void printAllDep() {
    System.out.print("Math Teachers: ");
    for (int i = 0; i < MathTeachers.size(); i++) {
      System.out.print(MathTeachers.get(i).getName() + "(" + MathTeachers.get(i).getId() + "), ");
    }
    System.out.print("\nScience Teachers: ");
    for (int i = 0; i < SciTeachers.size(); i++) {
      System.out.print(SciTeachers.get(i).getName() + "(" + SciTeachers.get(i).getId() + "), ");
    }
    System.out.print("\nEnglish Teachers: ");
    for (int i = 0; i < EngTeachers.size(); i++) {
      System.out.print(EngTeachers.get(i).getName() + "(" + EngTeachers.get(i).getId() + "), ");
    }
    System.out.print("\nWorld Language Teachers: ");
    for (int i = 0; i < WorldLangTeachers.size(); i++) {
      System.out.print(WorldLangTeachers.get(i).getName() + "(" + WorldLangTeachers.get(i).getId() + "), ");
    }
    System.out.print("\nReligion Teachers: ");
    for (int i = 0; i < RelTeachers.size(); i++) {
      System.out.print(RelTeachers.get(i).getName() + "(" + RelTeachers.get(i).getId() + "), ");
    }
    System.out.print("\nFine Art Teachers: ");
    for (int i = 0; i < FATeachers.size(); i++) {
      System.out.print(FATeachers.get(i).getName() + "(" + FATeachers.get(i).getId() + "), ");
    }
    System.out.println();
  }

}
