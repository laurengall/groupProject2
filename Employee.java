import java.util.ArrayList;
public class Employee {
private int id; 
private String name; 
private int salary; 
private int yearsExp; 
static private ArrayList<String> Admin;
static private ArrayList<String> Guidance;
static private ArrayList<String> Contractor;
static private ArrayList<String> Coaches;

  
 public Employee(){
   id = 0; 
   name = ""; 
   salary = 0; 
   yearsExp = 0;    
 } 
  public Employee(int id, String name, int sal, int years){
    this.id = id; 
    this.name = name; 
    this.salary = sal; 
    this.yearsExp = years; 
  }


  
  public int getId(){
    return id;
  }
  public String getName(){
    return name; 
  }
  public int getSalary(){
    return salary; 
  }
  public int getYearsExp(){
    return yearsExp; 
  }
  public void setId(int id){
    this.id = id; 
  }
  public void getName(String name){
    this.name = name; 
  }
  public void getSalary(int salary){
    this.salary = salary;
  }
  public void getYearsExp(int yearsExp){
    this.yearsExp = yearsExp; 
  }
}