import java.util.ArrayList; 
public class Contractor extends Employee {
 
  private String company;
  private int workDays;

  public Contractor(String name, int yearsExp,  String company, int workDays) {
    super(name, yearsExp, "contractor"); 
    this.company = company; 
    this.workDays = workDays; 
    addContractors(company); 
  }
static ArrayList<Contractor> security = new ArrayList<Contractor>();
static ArrayList<Contractor> cleanImg = new ArrayList<Contractor>();
static ArrayList<Contractor> contractors = new ArrayList<Contractor>();
  
  
  public String getCompany(){
    return company;
  }
  public int getWorkDays(){
    return workDays; 
  }


  public void setComp(String company){
    this.company = company; 
  }
  public void setWorkDays(int workDays){
    this.workDays = workDays;
  }

  public void addContractors(String company){
    switch(company.toLowerCase()){
      case "security":
        security.add(this);
        break; 
      case "clean image":
        cleanImg.add(this); 
        break; 
    }
  }

  public int removeFromDep(String company, int id){
    switch(company){
      case "security":
        for (int i = 0; i < security.size(); i++){
          if(security.get(i).getId() == id){
            security.remove(i);
            return 0;
          }
        }
        System.out.println("Contractor is not in company: " + company);
        break;
      case "clean image":
        for(int i = 0; i < cleanImg.size(); i++){
          if(cleanImg.get(i).getId() == id){
            cleanImg.remove(i);
            return 0;
          }
        }
        System.out.println("Contractor is not in company: " + company);
        break;
    }
    return -1;
  }
    
public static void printAllContractors() {
    System.out.print("Security Personnel: "); 
      for (Contractor nm : security) {
      System.out.print(nm.getName() + "(" + nm.getId() + "), ");
      }
      System.out.println("");
  System.out.print("Clean Image Workers: "); 
      for (Contractor nm : cleanImg) {
      System.out.print(nm.getName() + "(" + nm.getId() + "), ");
      }
      System.out.println("");
    }

    }