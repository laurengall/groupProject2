import java.util.ArrayList;

public class Employee {
  private int id;
  private String name;
  private String degree;
  private int salary;
  private int yearsExp;
  public static int numberOfEmployees = 0;
  static ArrayList<Employee> faculty = new ArrayList<Employee>();
  static ArrayList<Employee> staff = new ArrayList<Employee>();
  static ArrayList<Employee> contractor = new ArrayList<Employee>();
  static ArrayList<Employee> allEmployees = new ArrayList<Employee>();
  static ArrayList<Integer> idList = new ArrayList<Integer>();

  // constructors
  public Employee() {
    this.numberOfEmployees++;
    allEmployees.add(this);
  }

  public Employee(String name, int yearsExp, String job, String degree, Boolean departmentHead) {
    this.name = name;
    this.yearsExp = yearsExp;
    addJob(job);
    this.salary = calculateSalary(job, degree, departmentHead, yearsExp);
    this.degree = degree;
    this.numberOfEmployees++;
    generateId();
    allEmployees.add(this);

  }

  public Employee(String name, int years, String job) {
    this.name = name;
    this.yearsExp = years;
    this.numberOfEmployees++;
    generateId();
    allEmployees.add(this);
  }

  public int generateId() {
    boolean idAlreadyExist = false;
    for (int i = 0; i < Integer.MAX_VALUE; i++) {
      for (Integer j : idList) {
        idAlreadyExist = false;
        if (j == i) {
          idAlreadyExist = true;
        }
      }
      if (!idAlreadyExist) {
        idList.add(i);
        this.id = i;
        return 1;
      }
    }
    return -1;
  }

  public void addJob(String jobName) {
    switch (jobName.toLowerCase()) {
      case "faculty":
        faculty.add(this);
        break;
      case "staff":
        staff.add(this);
        break;
      case "contractor":
        contractor.add(this);
        break;
      default:
        break;
    }
  }

  static public void printIdName() {
    for (Employee x : allEmployees) {
      System.out.println(x.getName() + ": (" + x.getId() + ")");
    }
  }

  static public void calculatePayroll() {
    int temp = 0;
    int tempTwo = 0;
    for (Employee x : faculty) {
      temp += x.getSalary();
    }
    System.out.println("Faculty pay: $" + temp);
    tempTwo += temp;
    temp = 0;
    for (Employee x : staff) {
      temp += x.getSalary();
    }
    System.out.println("Staff pay: $" + temp);
    tempTwo += temp;
    temp = 0;
    for (Employee x : contractor) {
      temp += x.getSalary();
    }
    System.out.println("Contractor pay: $" + temp);
    tempTwo += temp;
    System.out.println("Total pay: $" + tempTwo);
  }

  public int calculateSalary(String job, String degree, Boolean departmentHead, int years) {
    int s = 0;
    
    switch (job.toLowerCase()) {
      case "contractor":    
        s = (int)(40000 * Math.pow(1.01, years));
            if (s > 40000) {
              s = 40000;
            }
        break;
      case "staff":
        switch (degree) {
          case "ba":
            s = (int)(60000 * Math.pow(1.03, years));
            if (s > 70000) {
              s = 70000;
            }
            break;
            case "bs":
            s = (int)(60000 * Math.pow(1.03, years));
            if (s > 70000) {
              s = 70000;
            }
            break;
            case "ma":
            s = (int)(64000 * Math.pow(1.03, years));
            if (s > 86000) {
              s = 86000;
            }
            break;
          case "ms":
            s = (int)(64000 * Math.pow(1.03, years));
            if (s > 86000) {
              s = 86000;
            }
            break;
          case "phd":
            s = (int)(70000 * Math.pow(1.03, years));
            if (s > 110000) {
              s = 110000;
            }
            break;
            
        }
        if (departmentHead == true) {
         s += 2500;
        }
        break;
      case "faculty":
        switch (degree) {
          case "ba":
            s = (int)(50000 * Math.pow(1.03, years));
            if (s > 60000) {
              s = 60000;
            }
            break;
            case "bs":
            s = (int)(60000 * Math.pow(1.03, years));
            if (s > 70000) {
              s = 70000;
            }
            
            break;
            case "ma":
            s = (int)(64000 * Math.pow(1.03, years));
            if (s > 86000) {
              s = 86000;
            }
            break;
          case "ms":
            s = (int)(000 * Math.pow(1.03, years));
            if (s > 70000) {
              s = 70000;
            }
            break;
          case "phd":
            s = (int)(58000 * Math.pow(1.03, years));
            if (s > 90000) {
              s = 90000;
            }
            break;             
        }
        if (departmentHead == true) {
         s += 2500;
        }
        break;
      
      default:
        break;
    }
    return s;
  }

  // getters n' setters
  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public int getSalary() {
    return salary;
   
  }

  public int getYearsExp() {
    return yearsExp;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public void setYearsExp(int yearsExp) {
    this.yearsExp = yearsExp;
  }
}