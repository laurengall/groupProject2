class Main {
  public static void main(String[] args) {
    boolean playing = true;
    while (playing) {
      System.out.println("--------------------------------------------------\n");
      System.out.println("Test Admin Console");
      System.out.println("1 - Add New Employee");
      System.out.println("2 - Edit Current Employee");
      System.out.println("3 - Remove Employee");
      System.out.println("4 - Employee Lister");
      System.out.println("5 - Payroll Computer");
      System.out.println("6 - Help");
      System.out.println("7 - Restart");
      System.out.println("8 - Quit");
      // Get user inputs
      String input = Tools.getInput().toLowerCase();
      Tools.clear();

      switch (input) {
        case "1": // add new employee
          addEmployee();
          break;
        case "2":
          Employee.printIdName();
          System.out.println("Type the Id of the employee you want to edit");
          int id = Tools.getInputInt();
          Employee.employeeId.get(id).editEmployee();
          break;
        case "3":
          Employee.printIdName();
          System.out.println("Type the Id of the employee you want to remove");
          System.out.println("It dont worky sorry");
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
        case "6":
          System.out.println("(1) - adds a new employee with the information you send in");
          System.out.println("(2) - allows you to change details about any given employee");
          System.out.println("(3) - removes employee from the database, and anything attached to said employee");
          System.out.println("(4) - allows you to choose how to list any and all employees by department, job, etc.");
          System.out
              .println("(5) - calculates payroll by specific department, then job type, then adds it all into one sum");
          break;
        case "7":
          Main.main(args);
          playing = false;
          break;
        case "8":
          System.out.println("Goodbye!");
          playing = false;
          break;
        default:
          System.out.println("That is not a valid command, try again.");
          break;
      }
    }

  }
  public static void removeEmployee() {
    
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

        // create staff object
        Staff newStaff = new Staff(emplName, emplYE, emplDep);
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
  }
}