import java.util.ArrayList;
 class Staff extends Employee{

  public static final String[] staffDepartments = {
    "Admin", "Guidance", "Coaches"
  };

  static ArrayList<Staff> admins = new ArrayList<Staff>();
  static ArrayList<Staff> guides = new ArrayList<Staff>();
  static ArrayList<Staff> coaches = new ArrayList<Staff>();

  public Staff(String name, int yearsExp, String department) {
    super(name, yearsExp, "staff");
    addDepartment(department);
  }


   static public void printAllDep() {
      System.out.print("Administration: ");
      for (Employee nm: admins) {
      System.out.print(nm.getName() + "(" + nm.getId() + "), ");
      }
      System.out.print("\nGuidance: ");
      for (Employee nm: guides) {
      System.out.print(nm.getName() + "(" + nm.getId() + "), ");
      }
    System.out.print("\nCoaches: ");
      for (Employee nm: coaches) {
      System.out.print(nm.getName() + "(" + nm.getId() + "), ");
      }
    System.out.println();
    }



   public void addDepartment(String depName) {
    switch (depName.toLowerCase()) {
      case "administration":
        admins.add(this);
        break;
      case "guidance":
        guides.add(this);
        break;
      case "coaches":
        coaches.add(this);
        break;
      default:
        break;
    }
  }

  public int removeFromDep(String depName, int empId){
    switch(depName){
      case "admin":
        for(int i = 0; i < admins.size(); i++){
          if(admins.get(i).getId() == empId){
            admins.remove(i);
            return 0;
          }
        }
        System.out.println("Staff is not in department: " + depName);
        break;
      case "guidance":
        for(int i = 0; i < guides.size(); i++){
          if(guides.get(i).getId() == empId){
            guides.remove(i);
            return 0;
          }
        }
        System.out.println("Staff is not in department: " + depName);
        break;
      case "coaches":
        for(int i = 0; i < coaches.size(); i++){
          if(coaches.get(i).getId() == empId){
            coaches.remove(i);
            return 0;
          }
        }
        System.out.println("Staff is not in department: " + depName);
        break;
      default:
        System.out.println(depName+" is not a valid department name");
        return -1;
    }
    return -1;
  }
}