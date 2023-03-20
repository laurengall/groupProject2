import java.util.ArrayList; 
public class Contractor extends Employee {
  private int wage;
  private String company;
  private int workDays;

  public Contractor(int id, String name, int yearsExp, int wage, String company, int workDays) {
    super(id, name, yearsExp, "Contractor"); 
    this.wage = wage; 
    this.company = company; 
    this.workDays = workDays; 
    addContractors(company); 
  }
static ArrayList<Contractor> security = new ArrayList<Contractor>();
static ArrayList<Contractor> cleanImg = new ArrayList<Contractor>();
static ArrayList<Contractor> contractors = new ArrayList<Contractor>();
  public int getWage(){
    return wage; 
  }
  public String getCompany(){
    return company;
  }
  public int getWorkDays(){
    return workDays; 
  }

  public void setWage(int wage){
    this.wage = wage; 
  }
  public void setComp(String company){
    this.company = company; 
  }
  public void setWorkDays(int workDays){
    this.workDays = workDays;
  }

  public void addContractors(String company){
    switch(company.toLowerCase()){
      case "bel air security llc":
        security.add(this);
        break; 
      case "clean image":
        cleanImg.add(this); 
        break; 
    }
  }
public static void printAllContractors() {
    System.out.print("Security Personnel: "); 
      for (Contractor nm : security) {
        System.out.print(nm.getName() + ", ");
      }
      System.out.println("");
  System.out.print("Clean Image Workers: "); 
      for (Contractor nm : cleanImg) {
        System.out.print(nm.getName() + ", ");
      }
      System.out.println("");
    }
    }
      
  
