class Main {
  public static void main(String[] args) {

    
    // Start program loop
    boolean playing = true;
    while (playing) {

      System.out.println("Test admin console");
      System.out.println("1 - Add new employee");
      System.out.println("2 - edit current employee");
      System.out.println("3 - remove employee");
      System.out.println("4 - employee lister");
      System.out.println("5 - payroll computer");
      System.out.println("6 - help");
      System.out.println("7 - restart");
      System.out.println("8 - quit");
      // Get user inputs
      String input = Tools.getInput().toLowerCase();
      Tools.clear();

      switch (input) {
        case "1": //add new employee
          addEmployee();
          break;
        case "2":
          System.out.println("to be implemented\n");
          break;
        case "3":
          System.out.println("to be implemented\n");
          break;
        case "4":
          System.out.println("Total Number of Employees: " + Employee.numberOfEmployees);
          System.out.println("\nFaculty:");
          Faculty.printAllDep();
          System.out.println("\nContractors:");
          Contractor.printAllContractors();
          System.out.println("-----------------------------------------------\n");
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
              .println("(5) - calculates payrole by specific department, then job type, then adds it all into one sum");
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
          System.out.println("That is not a valid command");
          break;
      }
    }

  }

  public static void addEmployee(){
    String input = "";
    boolean runSuccess = true;

    System.out.println
      ("Would you like to add: \n1 - Faculty\n2 - Contractor\n3 - Staff");
          
    //gather universal inputs
    input = Tools.getInput().toLowerCase();
    String emplName  = "";
    int emplId = -1;
    int emplYE = 0;
      if(input.equals("1")||input.equals("2")||input.equals("3")){
        Tools.clear();
        System.out.println("Name:");
        emplName = Tools.getInput();
        System.out.println("ID:");
        emplId = Tools.getInputInt();
        System.out.println("Years of Experience:");
        emplYE = Tools.getInputInt();
      }
      switch(input){
        case "1":
          //get rest of input for faculty
          System.out.println("Level of Education:");
          String emplDegree = Tools.getInput();
          System.out.println("Y/N - Is head of department?:");
          String temp = Tools.getInput();
          boolean emplHead;
          if(temp.equals("y") || temp.equals("yes")){
            emplHead = true;
          }else{
            emplHead = false;
          }
          System.out.println("Department:");
          String emplDep = Tools.getInput();
          //create new faculty object
          Faculty newFaculty = new Faculty(emplId, emplName, emplYE, emplDep, emplDegree, emplHead);
          break;
              
        case "2":
          //gather rest of constractor data
          System.out.println("Wage: ");
          int emplWage = Tools.getInputInt();
          System.out.println("Company:");
          String emplComp = Tools.getInput();
          System.out.println("Work Days:");
          int emplWD = Tools.getInputInt();

          //create contractor object
          Contractor newContractor = new Contractor(emplId, emplName, emplYE, emplWage, emplComp, emplWD);
          break;

        case "3":
          //gather rest of staff input 
          System.out.println("Department:");
          emplDep = Tools.getInput();

          //create staff object
          Staff newStaff = new Staff(emplId, emplName, emplYE, emplDep);
        default:
          runSuccess = false;
          System.out.println("valid inputs are 1,2, or 3");
          break;
      }

      if(runSuccess){
        System.out.println("New Employee Successfully Created!");
      }else{
        System.out.println("Unable to create new Employee.");
       }
       System.out.println("--------------------------------------------------\n");
  }
}