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

  // constructors
  public Employee() {
    this.numberOfEmployees++;
  }

  public Employee(int id, String name, int yearsExp, String job, String degree, Boolean departmentHead) {
    this.id = id;
    this.name = name;
    this.yearsExp = yearsExp;
    addJob(job);
    this.salary = calculateSalary(job, degree, departmentHead, yearsExp);
    this.degree = degree;
    this.numberOfEmployees++;
  }

  public Employee(int id, String name, int years, String job) {
    this.id = id;
    this.name = name;
    this.yearsExp = years;
    this.numberOfEmployees++;
  }

  // methods
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
  //idk i copied this code and I dont think it works as intended
  //do we need this? I don't want it
  /*public int removeFromJob(String jobName){
    switch(jobName){
      case "math":
        if(MathTeachers.get(i).getId() == empId){
            MathTeachers.remove(i);
            return 0;
          }
        }
        break;
      case "science":
        for(int i = 0; i < staff.size(); i++){
          staff.remove(i);
          return 0;
        }
        break;
      case "contractor":
        for(int i = 0; i < contractor.size(); i++){
          contractor.remove(i);
          return 0;
        }
        break;
      default:
        return -1;
    }
    return -1;
  }*/
 static public void calculatePayroll() {
    int temp = 0;
    int tempTwo = 0;
    for (Employee x: faculty) {
      temp += x.getSalary();
    } 
    System.out.println("Faculty pay: " + temp + "$");
    tempTwo += temp;
    temp = 0;
    for (Employee x: staff) {
      temp += x.getSalary();
    } 
    System.out.println("Staff pay: " + temp + "$");
    tempTwo += temp;
    temp = 0;
    for (Employee x: contractor) {
      temp += x.getSalary();
    } 
    System.out.println("Contrator pay: " + temp + "$");
    tempTwo += temp;
    System.out.println("Total pay: " + tempTwo + "$");
  }
  public int calculateSalary(String job, String degree, Boolean departmentHead, int years) {
    int s = 0;
    switch (job) {
      case "staff":
        switch (degree) {
          case "bachelor":
            s = 60000 * (int) Math.pow(1.03, years);
            if (s > 70000) {
              s = 70000;
            }
            break;
          case "master":
            s = 64000 * (int) Math.pow(1.03, years);
            if (s > 86000) {
              s = 86000;
            }
            break;
          case "doctorate":
            s = 70000 * (int) Math.pow(1.03, years);
            if (s > 110000) {
              s = 110000;
            }
            break;
        }
        break;
      case "faculty":
        switch (degree) {
          case "bachelor":
            s = 50000 * (int) Math.pow(1.03, years);
            if (s > 60000) {
              s = 60000;
            }
            break;
          case "master":
            s = 53000 * (int) Math.pow(1.03, years);
            if (s > 70000) {
              s = 70000;
            }
            break;
          case "doctorate":
            s = 58000 * (int) Math.pow(1.03, years);
            if (s > 90000) {
              s = 90000;
            }
            break;
        }
        if (departmentHead) {
          s += 2500;
        }
        break;
      case "contractor":
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

  public void getName(String name) {
    this.name = name;
  }

  public void getSalary(int salary) {
    this.salary = salary;
  }

  public void getYearsExp(int yearsExp) {
    this.yearsExp = yearsExp;
  }
}