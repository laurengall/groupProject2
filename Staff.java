import java.util.ArrayList;
 class Staff extends Employee{

  public static final String[] staffDepartments = {
    "Admin", "Guidance", "Coaches"
  };

  static ArrayList<String> Admins = new ArrayList<String>();
  static ArrayList<String> Guides = new ArrayList<String>();
  static ArrayList<String> Coaches = new ArrayList<String>();

  public Staff(int id, String name, int salary, int yearsExp, String Department) {
    super(id, name, yearsExp, "Staff");
  }


   


















   
}