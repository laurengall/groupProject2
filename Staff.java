import java.util.ArrayList;
 class Staff extends Employee{

  public static final String[] staffDepartments = {
    "Admin", "Guidance", "Coaches"
  };

  static ArrayList<Staff> Admins = new ArrayList<Staff>();
  static ArrayList<Staff> Guides = new ArrayList<Staff>();
  static ArrayList<Staff> Coaches = new ArrayList<Staff>();

  public Staff(int id, String name, int yearsExp, String Department) {
    super(id, name, yearsExp, "Staff");
    addDepartment(Department);
  }


   static public void printAllDep() {
      System.out.print("Administration: ");
      for (int i = 0; i < Admins.size(); i++) {
        System.out.print(Admins.get(i).getName() + ", ");
      }
      System.out.print("\nGuidance: ");
      for (int i = 0; i < Guides.size(); i++) {
        System.out.print(Guides.get(i).getName() + ", "); 
      }
    System.out.print("\nCoaches: ");
      for (int i = 0; i < Coaches.size(); i++) {
        System.out.print(Coaches.get(i).getName() + ", ");
      }
    System.out.println();
    }



   public void addDepartment(String depName) {
    switch (depName.toLowerCase()) {
      case "administration":
        Admins.add(this);
        break;
      case "guidance":
        Guides.add(this);
        break;
      case "coaches":
        Coaches.add(this);
        break;
      default:
        break;
    }
  }

  public int removeFromDep(String depName, int empId){
    switch(depName){
      case "admin":
        for(int i = 0; i < Admins.size(); i++){
          if(Admins.get(i).getId() == empId){
            Admins.remove(i);
            return 0;
          }
        }
        System.out.println("Staff is not in department: " + depName);
        break;
      case "guidance":
        for(int i = 0; i < Guides.size(); i++){
          if(Guides.get(i).getId() == empId){
            Guides.remove(i);
            return 0;
          }
        }
        System.out.println("Staff is not in department: " + depName);
        break;
      case "coaches":
        for(int i = 0; i < Coaches.size(); i++){
          if(Coaches.get(i).getId() == empId){
            Coaches.remove(i);
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