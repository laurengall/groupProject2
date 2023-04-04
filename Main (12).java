import java.util.ArrayList;
class Main {


  public static void main(String[] args) {
    
    //student declarations
		Student s1 = new Student("tom","male", 4.33, 15, true);
		Student s2 = new Student("wendy","female", 4.45, 17, false);
		Student s3 = new Student("xavier","male", 3.97, 16, false);
    Student s4 = new Student("peter","male", 4.0, 18, false);
    
    //subject definitions
    Subject APCalculus = new Subject("AP Calculus", true, false, false);
    Subject English3 = new Subject("English 3", false, false, true);

    //adding students to classes
    APCalculus.students.add(s1);
    APCalculus.students.add(s3);
		
    English3.students.add(s1);
    English3.students.add(s4);

    
    boolean playing = true;
    while (playing) {
      System.out.println("--------------------------------------------------\n");
      System.out.println("Test Admin Console");
      System.out.println("1 - Add New Employee");
      System.out.println("2 - Edit Current Employee");
      System.out.println("3 - Remove Employee");
      System.out.println("4 - Employee Lister");
      System.out.println("5 - Payroll Computer");
      System.out.println("6 - Student Roster");
      System.out.println("7 - Help");
      System.out.println("8 - Restart");
      System.out.println("9 - Quit");
      // Get user inputs
      String input = Tools.getInput().toLowerCase();
      Tools.clear();

      switch (input) {
        case "1": // add new employee
          addEmployee();
          break;
        case "2":
          Employee.printIdName();
          System.out.println("Type the Id of the employee you want to edit, or type -1 to go back");
          int id = Tools.getInputInt();
          if(id == -1){
            //skip
          } else if(Employee.employeeId.containsKey(id)){
            Employee.employeeId.get(id).editEmployee();
          }else{
            System.out.println("No Employee with ID: "+id);
          }
          break;
        case "3":
          Employee.printIdName();
          System.out.println("Type the Id of the employee you want to remove");
          int idremove = Tools.getInputInt();
          Employee.removeEmployeeById(idremove);
          Tools.waitms(1000);
          break;
        case "4":
          System.out.println("Total Number of Employees: " + Employee.numberOfEmployees);
          System.out.println("\nFaculty:");
          Faculty.printAllDep();
          System.out.println("\nContractors:");
          Contractor.printAllContractors();
          System.out.println("\nStaff:");
          Staff.printAllDep();
          break;
        case "5":
          Employee.calculatePayroll();
          break;
        case "6": //student roster
          studentRoster();
          break;
        case "7":
          System.out.println("(1) - Adds a new employee with the information you send in.");
          System.out.println("(2) - Allows you to change details about any given employee.");
          System.out.println("(3) - Removes employee from the database, and anything attached to said employee.");
          System.out.println("(4) - Allows you to choose how to list any and all employees by department, job, etc.");
          System.out
              .println("(5) - Calculates payroll by specific department, then job type, then adds it all into one sum.");
          break;
        case "8":
          Main.main(args);
          playing = false;
          break;
        case "9":
          System.out.println("Goodbye!");
          playing = false;
          break;
        default:
          System.out.println("That is not a valid command, try again.");
          break;
      }
    }

  }
    
  public static void addEmployee() {
    String input = "";
    boolean runSuccess = true;

    System.out.println("Would you like to add: \n1 - Faculty\n2 - Contractor\n3 - Staff");

    // gather universal inputs
    input = Tools.getInput().toLowerCase();
    String emplName = "";
    int emplYE = 0;
    if (input.equals("1") || input.equals("2") || input.equals("3")) {
      Tools.clear();
      System.out.println("Name:");
      emplName = Tools.getInput();
      System.out.println("Years of Experience:");
      emplYE = Tools.getInputInt();
    }
    switch (input) {
      case "1":
        // get rest of input for faculty
        System.out.println("Level of Education:");
        String emplDegree = Tools.getInput();
        System.out.println("Y/N - Is head of department?:");
        String temp = Tools.getInput();
        boolean emplHead;
        if (temp.equals("y") || temp.equals("yes")) {
          emplHead = true;
        } else {
          emplHead = false;
        }
        System.out.println("Department:");
        String emplDep = Tools.getInput();
        // create new faculty object
        Faculty newFaculty = new Faculty(emplName, emplYE, emplDep, emplDegree, emplHead);
        break;

      case "2":
        // gather rest of contractor data
        
        System.out.println("Company:");
        String emplComp = Tools.getInput();
        System.out.println("Work Days:");
        int emplWD = Tools.getInputInt();
        System.out.println("Wage:");
        int wage = Tools.getInputInt();

        // create contractor object
        Contractor newContractor = new Contractor(emplName, emplYE, emplComp, emplWD, wage);
     
        break;

      case "3":
        // gather rest of staff input       
        System.out.println("Department:");
        emplDep = Tools.getInput();
         System.out.println("Work Days:");
        int wd = Tools.getInputInt();
        System.out.println("Wage:");
        int wag = Tools.getInputInt();
        // create staff object
        Staff newStaff = new Staff(emplName, emplYE, emplDep, wd, wag);
        break; 
        
      default:
        runSuccess = false;
        System.out.println("Valid inputs are 1, 2, or 3.");
        break;
    }

    if (runSuccess) {
      System.out.println("New Employee Successfully Created!");
    } else {
      System.out.println("Unable to create new Employee.");
    }
// subject: int numOfStudents, boolean isAP, boolean isHonors, boolean isRegular, Faculty teacher, ArrayList<Student> students

	// student: String gender, double GPA, int age, boolean isReligious



		/*Subject APCalcAB = new Subject*/
		
  }

  public static void studentRoster(){
    System.out.println("Select a class:");
    for(Subject s : Subject.classes){
      System.out.println(s.name);
    }
    String input = Tools.getInput();
    Tools.clear();
    boolean success = false;
    for(Subject s : Subject.classes){
      if(s.name.equalsIgnoreCase(input)){
        s.printClassRoster();
        success = true;
      }
    }
    if(!success){
      System.out.println(input+" is not a valid class.");
    }

  }
}