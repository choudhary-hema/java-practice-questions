
public class StaticVariables {
  public static void main(String args[]) {
    
    
    Employee emp1 = new Employee("Nick","HR");
    Employee emp2 = new Employee("Robert","IT");
    
    Employee emp3 = new Employee("Harry","IT");
    Employee emp4 = new Employee("Sajel","Admin");
    
    printEmployeeData(emp1, emp2, emp3, emp4); 
  }
  
  
  public static void printEmployeeData(Employee emp1,Employee emp2, Employee emp3, Employee emp4){
      System.out.println("Staff Data = " + emp1.name + ", " + emp2.name + ", "
       + emp3.name + ", " + emp4.name );
       
      new Employee().getEmployeeCount(); // calling non-static method from static method using class instance
      
  }
}
class Employee {
    
    public String name;
    public String dept;
    public static int staffCount;
    
    public Employee(){ 
    }
    public Employee(String name, String dept){
       this.name = name; 
       this.dept = dept;
       staffCount++;
    }
    public void getEmployeeCount(){
      System.out.println("Staff Count = " + Employee.staffCount);
  }
}
