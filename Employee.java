import java.util.ArrayList;
import java.util.*;
public class Employee {
  private int id;
  private String name;
  private String degree;
  private int salary;
  private int yearsExp;
  private String job;
  public static int numberOfEmployees = 0;
  static ArrayList<Employee> faculty = new ArrayList<Employee>();
  static ArrayList<Employee> staff = new ArrayList<Employee>();
  static ArrayList<Employee> contractor = new ArrayList<Employee>();
  static HashMap<Integer,Employee> employeeId = new HashMap<Integer,Employee>();
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
    this.job = job;
    this.degree = degree;
    this.salary = calculateSalary(departmentHead);
    this.numberOfEmployees++;
    generateId();
    allEmployees.add(this);
    employeeId.put(this.id, this);
  }

  public Employee(String name, int years, String job) {
    this.name = name;
    this.yearsExp = years;
    addJob(job);
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
 //dont delete needed for overidden
  public void editEmployee() {
    
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

  public int calculateSalary(boolean departmentHead) {
    int s = 0;
    String job = this.job;
    String degree = this.degree;
    int years = this.yearsExp;
    switch (job.toLowerCase()) {
    
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
  public String getJob() {
    return job;
  }
  public int getYearsExp() {
    return yearsExp;
  }
  public String getDegree() {
    return degree;
  }
  public void setDegree(String degree) {
    this.degree = degree;
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