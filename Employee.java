import java.util.ArrayList;

public class Employee {
  private int id;
  private String name;
  private int salary;
  static private int totalSalary;
  private int yearsExp;

  // constructors
  public Employee() { 
  }

  public Employee(int id, String name, int years) {
    this.id = id;
    this.name = name;
    this.totalSalary += sal;
    this.yearsExp = years;
  }

  // methods
public int calculateSalary(String job, String degree, Boolean departmentHead, int years){
    switch (job) {
      case "staff":
      break;
      case "faculty":
        switch (degree) {
          case "bachelor":
            salary = 50000;
          break;
          case "master":
            salary = 53000;
          break;
          case "doctorate":
            salary = 58000;
          break;
        }
        salary = salary * (int)Math.pow(1.03, years);
        if (departmentHead) {
          salary =+ 2500;
        }
      break;
      case "contractor":
      break;
      default:
      break;
    }
    return salary;
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